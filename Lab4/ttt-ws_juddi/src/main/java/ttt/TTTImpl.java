package ttt;

import java.util.LinkedList;

import javax.jws.WebService;

@WebService(endpointInterface="ttt.TTT")
public class TTTImpl implements TTT {

	private char board[][] = {
			{'1','2','3'}, /* Initial values are reference numbers */
			{'4','5','6'}, /* used to select a vacant square for   */
			{'7','8','9'}  /* a turn.                              */
	};
	private int nextPlayer = 0;
	private int numPlays = 0;
	private LinkedList<Integer> player1Plays = new LinkedList<Integer>();
	private LinkedList<Integer> player0Plays = new LinkedList<Integer>();


	public String currentBoard() {
		String s = "\n\n " +
				board[0][0]+" | " +
				board[0][1]+" | " +
				board[0][2]+" " +
				"\n---+---+---\n " +
				board[1][0]+" | " +
				board[1][1]+" | " +
				board[1][2]+" " +
				"\n---+---+---\n " +
				board[2][0]+" | " +
				board[2][1]+" | " +
				board[2][2] + " \n";
		return s;
	}

	public boolean play(int row, int column, int player) {
		if (!(row >=0 && row <3 && column >= 0 && column < 3))
			return false;
		if (board[row][column] > '9')
			return false;
		if (player != nextPlayer)
			return false;

		if (numPlays == 9)
			return false;

		Integer location = Character.getNumericValue(board[row][column]);

		board[row][column] = (player == 1) ? 'X' : 'O';        /* Insert player symbol   */
		if (player == 1){
			if(player1Plays.size()==3){
				player1Plays.removeFirst();
			}
			player1Plays.add(location);
		}
		else{
			if (player0Plays.size()==3){
				player0Plays.removeFirst();
			}
			player0Plays.add(location);
		}
		
		nextPlayer = (nextPlayer + 1) % 2;
		numPlays ++;
		return true;
	}

	public String last3Plays(){
		String lastplays = new String();
		lastplays = "Last 3 plays from player " + nextPlayer + " were:\n";
		LinkedList<Integer> toIterate;
		if (nextPlayer == 0)
			toIterate = player0Plays;
		else
			toIterate = player1Plays;
		for (Integer i : toIterate){
			lastplays += ("played in board pos:" + i +"\n");
		}
		return lastplays;
	}

	public int checkWinner() {
		int i;

		/* Check for a winning line - diagonals first */
		if((board[0][0] == board[1][1] && board[0][0] == board[2][2]) ||
				(board[0][2] == board[1][1] && board[0][2] == board[2][0])) {
			if (board[1][1]=='X')
				return 1;
			else
				return 0;
		} else {
			/* Check rows and columns for a winning line */
			for(i = 0; i <= 2; i ++) {
				if((board[i][0] == board[i][1] && board[i][0] == board[i][2])) {
					if (board[i][0]=='X')
						return 1;
					else
						return 0;
				}

				if ((board[0][i] == board[1][i] && board[0][i] == board[2][i])) {
					if (board[0][i]=='X')
						return 1;
					else
						return 0;
				}
			}
		}

		if (numPlays == 9)
			return 2; /* A draw! */
		else
			return -1; /* Game is not over yet */
	}

}

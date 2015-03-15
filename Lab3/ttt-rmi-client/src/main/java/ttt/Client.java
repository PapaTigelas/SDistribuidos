package ttt;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class Client {
	static Scanner userIN;
	static TTTService tttgame;
	static int winner = 0;
	static int player = 1;
	
	public static void playGame() throws RemoteException {
		int play;
		boolean playAccepted;

		do {
			player = ++player % 2;
			do {
				System.out.println(tttgame.currentBoard());
				play = readPlay();
				if (play != 0 && play!=11) {
					playAccepted = tttgame.play( --play / 3, play % 3, player);
					if (!playAccepted)
						System.out.println("Invalid play! Try again.");
				
				}
				else if (play == 11){
					playAccepted = tttgame.playRandom();
				}
				else
					playAccepted = false;
			} while (!playAccepted);
			winner = tttgame.checkWinner();
		} while (winner == -1);
	}
	
	public static void congratulate() throws RemoteException {
		System.out.println(tttgame.currentBoard());
		if (winner == 2)
			System.out.printf("\nHow boring, it is a draw\n");
		else
			System.out.printf(
					"\nCongratulations, player %d, YOU ARE THE WINNER!\n",
					winner);
	}

	public static int readPlay() {
		int play;
		do {
			System.out.printf("\nPlayer %d, please enter the number of the square "
							+ "where you want to place your %c (or 0 to refresh the board): \n",
							player, (player == 1) ? 'X' : 'O');
			play = userIN.nextInt();
			if(play == 11) return play;
		} while ((play > 9 || play < 0));
		return play;
	}

    public static void main(String[] args) throws Exception {
    	  userIN = new Scanner(System.in);
    	  tttgame = null;
    	  try{
    		  Registry reg = LocateRegistry.getRegistry(1040);
    		  tttgame = (TTTService) reg.lookup("//localhost/TTT");
    		  System.out.println("Server found. Starting game...");
    		  playGame();
    		  congratulate();
    		  //Start the play sequence
    	  }
    	  catch(Exception e){
    		e.printStackTrace();
    	  }
    }

}

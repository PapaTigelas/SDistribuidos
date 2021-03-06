package ttt;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface TTTService extends Remote {
	public int checkWinner() throws RemoteException;
	public boolean play(int row, int column, int player) throws RemoteException;
	public String currentBoard() throws RemoteException;
	public boolean playRandom() throws RemoteException;
}

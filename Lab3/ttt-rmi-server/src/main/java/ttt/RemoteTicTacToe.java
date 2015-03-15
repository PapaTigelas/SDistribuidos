package ttt;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RemoteTicTacToe {

	public static void main(String[] args) throws RemoteException{
		try{
			TTT tttserv = new TTT();
			System.out.println("Created Service instance");
			Registry reg = LocateRegistry.createRegistry(1040);
			reg.rebind("//localhost/TTT", tttserv);
		}
		catch(Exception e){
			System.out.println("TTT game " + e.getMessage()); 
		}
	}

}


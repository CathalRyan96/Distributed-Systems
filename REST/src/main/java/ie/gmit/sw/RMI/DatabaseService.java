package ie.gmit.sw.RMI;

import java.rmi.Remote;
import java.rmi.RemoteException;

import ie.gmit.sw.RMI.DatabaseService;

public interface DatabaseService extends Remote {
	public DatabaseService getBooking() throws RemoteException;

}

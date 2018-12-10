package ie.gmit.sw.Service;

import java.rmi.*;

public interface DatabaseService extends Remote {
	public DatabaseService getBooking() throws RemoteException;

}

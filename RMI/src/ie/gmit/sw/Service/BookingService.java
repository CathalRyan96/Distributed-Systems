package ie.gmit.sw.Service;

import java.rmi.*;

public interface BookingService extends Remote {
	public BookingService getBooking() throws RemoteException;

}

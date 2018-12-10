package ie.gmit.sw.Service;

import java.rmi.*;
import java.rmi.server.*;

public class DatabaseServiceImpl extends UnicastRemoteObject implements DatabaseService {
	private static final long serialVersionUID = 1L;
	private Booking booking;
	
	public DatabaseServiceImpl() throws RemoteException{
		super();
	}
	
	public DatabaseServiceImpl(Booking b) throws RemoteException{
		this.booking = b;
	}

	@Override
	public DatabaseService getBooking() throws RemoteException {
		
		return null;
	}
	
	

}

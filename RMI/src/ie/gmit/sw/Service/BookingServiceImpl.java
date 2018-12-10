package ie.gmit.sw.Service;

import java.rmi.*;
import java.rmi.server.*;

public class BookingServiceImpl extends UnicastRemoteObject implements BookingService {
	private static final long serialVersionUID = 1L;
	private Booking booking;
	
	public BookingServiceImpl(Booking b) throws RemoteException{
		this.booking = b;
	}
	
	public Booking getBooking() throws RemoteException {
		return booking;
	}

}

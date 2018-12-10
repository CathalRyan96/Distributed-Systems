package ie.gmit.sw.Service;

import java.rmi.*;
import java.rmi.registry.*;

public class Server {
	public static void main(String[] args) throws Exception{
		//A string, representing the message we want to associate with our Message object
		String myBookingStr = "Hello from 127.0.0.1";
		
		//Create an instance of the class Message and pass the string as an argument to its constructor.
		Booking myBooking = new Booking(myBookingStr);
		
		//Create an instance of a MessageService. As MessageServiceImpl implements the MessageService
		//interface, it can be referred to as a MessageService type.
		BookingService ms = new BookingServiceImpl(myBooking);
		
		//Start the RMI regstry on port 1099
		LocateRegistry.createRegistry(1099);
		
		//Bind our remote object to the registry with the human-readable name "howdayService"
		Naming.rebind("howdayService", (Remote) ms);
		
		//Print a nice message to standard output
		System.out.println("Server ready.");
	}
}

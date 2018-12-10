package ie.gmit.sw.Service;

import java.rmi.*;
import java.rmi.server.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DatabaseServiceImpl extends UnicastRemoteObject implements DatabaseService {
	private static final long serialVersionUID = 1L;
	private Booking booking;
	
	private Connection conn;
	private Statement s;
	
	
	
	protected DatabaseServiceImpl() throws RemoteException, SQLException{
		super();
		
		//make connection to database
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306:/carsdb?useSSL=false","root","");
		s = conn.createStatement();
		
	
	}
	
	
		
		
	
	
	public DatabaseServiceImpl(Booking b) throws RemoteException{
		this.booking = b;
	}

	@Override
	public DatabaseService getBooking() throws RemoteException {
		
		return null;
	}
	
	

}

package ie.gmit.sw.Service;

import java.rmi.*;
import java.rmi.registry.*;

public class ServiceSetup {
	public static void main(String[] args) throws Exception{
		
		
		
		
		DatabaseService ds = new DatabaseServiceImpl();
		
		//Start the RMI regstry on port 1099
		LocateRegistry.createRegistry(1099);
		
		Naming.rebind("db", (Remote) ds);
		
		//Print a nice message to standard output
		System.out.println("Server ready...");
	}
}

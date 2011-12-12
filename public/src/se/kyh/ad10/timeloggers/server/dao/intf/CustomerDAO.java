package se.kyh.ad10.timeloggers.server.dao.intf;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import se.kyh.ad10.timeloggers.server.entities.Customer;

public interface CustomerDAO extends Remote, Serializable {
	
   public boolean saveCustomer(String name) throws RemoteException;
   
   public boolean changeCustomerActivityStatus(int id) throws RemoteException;
   
   public Customer getCustomer(int id) throws RemoteException;
   
   public List<Customer> getAllCustomers() throws RemoteException;
   
   }

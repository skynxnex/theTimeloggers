package se.kyh.ad10.timeloggers.server.dao.intf;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import se.kyh.ad10.timeloggers.server.entities.Customer;
import se.kyh.ad10.timeloggers.server.entities.CustomerInfo;

public interface CustomerInfoDAO extends Remote, Serializable {
	
   public boolean saveCustomerInfo(CustomerInfo customerInfo) throws RemoteException;
   
   public boolean deleteCustomerInfo(int id) throws RemoteException;
   
   public List<Customer> listCustomerInfoByCustomer(int id) throws RemoteException;
   
   }

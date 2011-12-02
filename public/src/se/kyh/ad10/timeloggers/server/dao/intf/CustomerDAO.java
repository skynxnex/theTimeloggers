package se.kyh.ad10.timeloggers.server.dao.intf;

import java.util.List;

import se.kyh.ad10.timeloggers.server.entities.Customer;

public interface CustomerDAO {
   public boolean saveCustomer(String name);
   
   public boolean changeCustomerActivityStatus(int id);
   
   public Customer getCustomer(int id);
   
   public List<Customer> getAllCustomers();
   
   }

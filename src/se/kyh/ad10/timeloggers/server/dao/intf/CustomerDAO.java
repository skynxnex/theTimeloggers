package se.kyh.ad10.timeloggers.server.dao.intf;
import null.List;

import se.kyh.ad10.timeloggers.server.entities.Customer;
import List;

public interface CustomerDAO {
   public boolean saveCustomer(String name);
   
   public boolean changeCustomerActivityStatus(int id);
   
   public Customer getCustomer(int id);
   
   public List getAllCustomers();
   
   }

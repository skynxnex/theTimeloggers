package se.kyh.ad10.timeloggers.server.dao.intf;
import null.List;

import List;

public interface CustomerInfoDAO {
   public boolean saveCustomerInfo(String value, int customerId, int infoTypeId);
   
   public boolean deleteCustomerInfo(int id);
   
   public List listCustomerInfoByCustomer(int id);
   
   }

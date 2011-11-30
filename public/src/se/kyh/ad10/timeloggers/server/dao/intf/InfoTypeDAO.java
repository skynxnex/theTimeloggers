package se.kyh.ad10.timeloggers.server.dao.intf;



public interface InfoTypeDAO {
   public boolean saveInfoType(String name);
   
   public String getInfoTypeName(int id);
   
   public boolean deleteInfoType(int id);
   
   }

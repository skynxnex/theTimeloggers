package se.kyh.ad10.timeloggers.server.dao.intf;


public interface RoleDAO {
   public String getRoleName(int id);
   
   public boolean saveRole(String name);
   
   public boolean deleteRole(int id);
   
   }

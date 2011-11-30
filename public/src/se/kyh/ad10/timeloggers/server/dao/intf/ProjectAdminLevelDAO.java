package se.kyh.ad10.timeloggers.server.dao.intf;



public interface ProjectAdminLevelDAO {
   public String getProjectAdminLevelName(int id);
   
   public boolean saveProjectAdminLevel(String name, int level);
   
   }

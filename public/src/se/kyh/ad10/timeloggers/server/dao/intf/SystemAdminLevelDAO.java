package se.kyh.ad10.timeloggers.server.dao.intf;

import java.util.List;


public interface SystemAdminLevelDAO {
   public int getAdminLevel(int id);
   
   public boolean setAdminLevel(int id);
   
   public List listAllLevels();
   
   }

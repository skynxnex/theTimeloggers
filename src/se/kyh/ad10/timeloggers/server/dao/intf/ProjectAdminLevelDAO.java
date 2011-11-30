package se.kyh.ad10.timeloggers.server.dao.intf;
import null.string;

import string;

public interface ProjectAdminLevelDAO {
   public String getProjectAdminLevelName(int id);
   
   public boolean saveProjectAdminLevel(string name, int level);
   
   }

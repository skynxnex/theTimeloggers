package se.kyh.ad10.timeloggers.server.dao.intf;


public interface FeeInProjecctDAO {
   public boolean saveFeeInProject(int fee, int projectId, int roleId);
   
   public boolean deleteFeeInProject(int id);
   
   }

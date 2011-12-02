package se.kyh.ad10.timeloggers.server.dao.intf;


public interface UserInProjectDAO {
   public boolean addUserToProject(int userId, int projectId, int projectAdminLevelId);
   
   public boolean removeUserFromProject(int id);
   
   }

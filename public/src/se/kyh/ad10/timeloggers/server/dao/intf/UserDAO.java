package se.kyh.ad10.timeloggers.server.dao.intf;

import java.util.List;

import se.kyh.ad10.timeloggers.server.entities.Role;
import se.kyh.ad10.timeloggers.server.entities.User;


public interface UserDAO {
   public void getUserById(int id);
   
   public User login(String email, String password);
   
   public boolean saveUser(User user);
   
   public List<User> getAllUsers();
   
   public void deleteUser(int id);
   
   public boolean inactivateUser(int id);
   
   public boolean activateUser(int id);
   
   public String getName(int id);
   
   public List<Role> getUserRolesInProject(int userId, int projectId);
   
   public List getUsersForProject(int projectId);
   
   }

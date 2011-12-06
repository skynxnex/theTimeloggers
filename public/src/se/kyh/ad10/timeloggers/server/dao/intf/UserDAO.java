package se.kyh.ad10.timeloggers.server.dao.intf;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import se.kyh.ad10.timeloggers.server.entities.Role;
import se.kyh.ad10.timeloggers.server.entities.User;


public interface UserDAO extends Remote, Serializable {
	
   public void getUserById(int id) throws RemoteException;
   
   public User login(String email, String password) throws RemoteException;
   
   public boolean saveUser(User user) throws RemoteException;
   
   public List<User> getAllUsers() throws RemoteException;
   
   public void deleteUser(int id) throws RemoteException;
   
   public boolean inactivateUser(int id) throws RemoteException;
   
   public boolean activateUser(int id) throws RemoteException;
   
   public String getName(int id) throws RemoteException;
   
   public List<Role> getUserRolesInProject(int userId, int projectId) throws RemoteException;
   
   public List<User> getUsersForProject(int projectId) throws RemoteException;
   
   }

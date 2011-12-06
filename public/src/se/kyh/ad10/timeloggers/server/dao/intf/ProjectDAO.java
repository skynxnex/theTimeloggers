package se.kyh.ad10.timeloggers.server.dao.intf;


import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import se.kyh.ad10.timeloggers.server.entities.Project;

public interface ProjectDAO extends Remote, Serializable {
	
   public boolean saveProjectActivityStatus(int id) throws RemoteException;
   
   public List<Project> getAllProjectsForCustomer(int projectId, int customerId) throws RemoteException;
   
   public boolean saveProject(String name, int budget, int estimatedTime, int customerId) throws RemoteException;
   
   public Project getProject(int id) throws RemoteException;
   
   }

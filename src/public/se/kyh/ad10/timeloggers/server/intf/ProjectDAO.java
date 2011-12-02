package se.kyh.ad10.timeloggers.server.dao.intf;

import List;
import se.kyh.ad10.timeloggers.server.entities.Project;

public interface ProjectDAO {
   public boolean saveProjectActivityStatus(int id);
   
   public List getAllProjectsForCustomer(int projectId, int customerId);
   
   public boolean saveProject(String name, int budget, int estimatedTime, int customerId);
   
   public Project getProject(int id);
   
   }

package se.kyh.ad10.timeloggers.server.dao.impl;

import java.util.List;
import se.kyh.ad10.timeloggers.server.dao.intf.ProjectDAO;
import se.kyh.ad10.timeloggers.server.db.DB;
import se.kyh.ad10.timeloggers.server.entities.Project;

public class ProjectDAOImpl extends DB implements ProjectDAO {

	@Override
	public boolean saveProjectActivityStatus(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List getAllProjectsForCustomer(int projectId, int customerId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveProject(String name, int budget, int estimatedTime,
			int customerId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Project getProject(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}

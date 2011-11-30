package se.kyh.ad10.timeloggers.server.dao.impl;

import se.kyh.ad10.timeloggers.server.dao.intf.UserInProjectDAO;
import se.kyh.ad10.timeloggers.server.db.DB;

public class UserInProjectDAOImpl extends DB implements UserInProjectDAO {

	@Override
	public boolean addUserToProject(int userId, int projectId,
			int projectAdminLevelId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeUserFromProject(int id) {
		// TODO Auto-generated method stub
		return false;
	}
}

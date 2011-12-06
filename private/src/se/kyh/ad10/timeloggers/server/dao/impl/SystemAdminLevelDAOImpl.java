package se.kyh.ad10.timeloggers.server.dao.impl;

import java.util.List;

import se.kyh.ad10.timeloggers.server.dao.intf.SystemAdminLevelDAO;
import se.kyh.ad10.timeloggers.server.db.DB;

public class SystemAdminLevelDAOImpl extends DB implements SystemAdminLevelDAO {

	@Override
	public int getAdminLevel(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean setAdminLevel(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List listAllLevels() {
		// TODO Auto-generated method stub
		return null;
	}
}

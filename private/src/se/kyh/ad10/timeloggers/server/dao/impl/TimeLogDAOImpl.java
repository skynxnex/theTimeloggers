package se.kyh.ad10.timeloggers.server.dao.impl;

import java.sql.Date;
import java.util.List;

import se.kyh.ad10.timeloggers.server.dao.intf.TimeLogDAO;
import se.kyh.ad10.timeloggers.server.db.DB;
import se.kyh.ad10.timeloggers.server.entities.Timelog;

public class TimeLogDAOImpl extends DB implements TimeLogDAO {

	@Override
	public List<Timelog> getAllTimeLogsForUserInProject(int userId,
			int projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Timelog> getAllTimelogsForProject(int projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteTimeLog(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean saveTimeLog(String title, String comment, int duration, Date start, int projectId, String userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean startTimeLog(int userId, int projectId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean stopTimeLog(int timeLogId, String title, String comment) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Timelog> getAllTimeLogsForUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}
}

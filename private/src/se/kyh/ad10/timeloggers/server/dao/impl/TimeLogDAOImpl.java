package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import se.kyh.ad10.timeloggers.server.dao.intf.TimeLogDAO;
import se.kyh.ad10.timeloggers.server.entities.Timelog;

@SuppressWarnings("serial")
public class TimeLogDAOImpl extends UnicastRemoteObject implements TimeLogDAO {

	protected TimeLogDAOImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

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
	public boolean saveTimeLog(Timelog timelog) {
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

package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import se.kyh.ad10.timeloggers.server.dao.intf.AttendedTimeDAO;
import se.kyh.ad10.timeloggers.server.entities.AttendedTime;

@SuppressWarnings("serial")
public class AttendedTimeDAOImpl extends UnicastRemoteObject implements AttendedTimeDAO {

	public AttendedTimeDAOImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<AttendedTime> listAll() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveAttendedTime(AttendedTime AttendedTime) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAttendedTime(int id) throws RemoteException {
		// TODO Auto-generated method stub
		return false;
	}
}

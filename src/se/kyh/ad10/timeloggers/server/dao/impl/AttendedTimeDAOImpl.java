package se.kyh.ad10.timeloggers.server.dao.impl;

import java.util.List;

import se.kyh.ad10.timeloggers.server.dao.intf.AttendedTimeDAO;
import se.kyh.ad10.timeloggers.server.entities.AttendedTime;
import se.kyh.ad10.timeloggers.server.db.DB;

public class AttendedTimeDAOImpl extends DB implements AttendedTimeDAO {

	@Override
	public List<AttendedTime> listAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveAttendedTime(AttendedTime AttendedTime) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteAttendedTime(int id) {
		// TODO Auto-generated method stub
		return false;
	}
}

package se.kyh.ad10.timeloggers.server.dao.intf;

import java.util.List;

import se.kyh.ad10.timeloggers.server.entities.AttendedTime;

public interface AttendedTimeDAO {
   public List<AttendedTime> listAll();
   
   public boolean saveAttendedTime(AttendedTime AttendedTime);
   
   public boolean deleteAttendedTime(int id);
   
   }

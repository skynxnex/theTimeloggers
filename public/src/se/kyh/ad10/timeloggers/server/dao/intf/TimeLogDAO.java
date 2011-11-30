package se.kyh.ad10.timeloggers.server.dao.intf;

import java.sql.Date;
import java.util.List;

import se.kyh.ad10.timeloggers.server.entities.Timelog;

public interface TimeLogDAO {
   public List<Timelog> getAllTimeLogsForUserInProject(int userId, int projectId);
   
   public List<Timelog> getAllTimelogsForProject(int projectId);
   
   public boolean deleteTimeLog(int id);
   
   public boolean saveTimeLog(String title, String comment, int duration, Date start, int projectId, String/*No type specified*/ userId);
   
   public boolean startTimeLog(int userId, int projectId);
   
   public boolean stopTimeLog(int timeLogId, String title, String comment);
   
   public List<Timelog> getAllTimeLogsForUser(int userId);
   
   }

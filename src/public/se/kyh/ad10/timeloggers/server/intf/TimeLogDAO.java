package se.kyh.ad10.timeloggers.server.dao.intf;

import List<TimeLog>;
import DateTime;

public interface TimeLogDAO {
   public List<TimeLog> getAllTimeLogsForUserInProject(int userId, int projectId);
   
   public List<TimeLog> getAllTimelogsForProject(int projectId);
   
   public boolean deleteTimeLog(int id);
   
   public boolean saveTimeLog(String title, String comment, int duration, DateTime start, int projectId, String/*No type specified*/ userId);
   
   public boolean startTimeLog(int userId, int projectId);
   
   public boolean stopTimeLog(int timeLogId, String title, String comment);
   
   public List<TimeLog> getAllTimeLogsForUser(int userId);
   
   }

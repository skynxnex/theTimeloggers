package se.kyh.ad10.timeloggers.server.dao.intf;

import List;

public interface UserInfoDAO {
   public List listUserInfoByUser(int userId);
   
   public boolean deleteUserInfo(int id);
   
   public boolean saveUserInfo(String value, int userId, int infoTypeId);
   
   }

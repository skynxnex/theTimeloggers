package se.kyh.ad10.timeloggersPublic.server;

import se.kyh.ad10.timeloggers.server.dao.intf.UserDAO;
import se.kyh.ad10.timeloggers.server.dao.intf.UserInfoDAO;

public interface PublicInterface {
   public UserDAO getUserDAO();
   
   public UserInfoDAO getUserInfoDAO();
   
   }

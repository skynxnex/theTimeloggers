package se.kyh.ad10.timeloggers.server.dao.impl;

import java.util.HashSet;
import java.util.Set;

import se.kyh.ad10.timeloggers.server.dao.intf.InfoTypeDAO;
import se.kyh.ad10.timeloggers.server.db.DB;
import se.kyh.ad10.timeloggers.server.entities.InfoType;

public class InfoTypeDAOImpl extends DB implements InfoTypeDAO {
   /**
    * <pre>
    *           0..*     0..*
    * InfoTypeDAOImpl ------------------------- InfoType
    *           infoTypeDAO        &gt;       infoType
    * </pre>
    */
   private Set<InfoType> infoType;
   
   public Set<InfoType> getInfoType() {
      if (this.infoType == null) {
         this.infoType = new HashSet<InfoType>();
      }
      return this.infoType;
   }

@Override
public boolean saveInfoType(String name) {
	// TODO Auto-generated method stub
	return false;
}

@Override
public String getInfoTypeName(int id) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public boolean deleteInfoType(int id) {
	// TODO Auto-generated method stub
	return false;
}
   
   }

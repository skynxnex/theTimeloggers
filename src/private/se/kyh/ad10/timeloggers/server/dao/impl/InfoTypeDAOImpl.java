package se.kyh.ad10.timeloggers.server.dao.impl;

import DB;
import InfoTypeDAO;
import se.kyh.ad10.timeloggers.server.entities.InfoType;
import java.util.Set;
import java.util.HashSet;

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
   
   }

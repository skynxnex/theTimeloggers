package se.kyh.ad10.timeloggers.server.engine;

import java.util.Set;
import java.util.HashSet;

/**
 * Själva servern där allt snurrar
 */
public class ServerEngine {
   /**
    * <pre>
    *           1..1     0..*
    * ServerEngine ------------------------> SecurityLayerImpl
    *           serverEngine        &gt;       securityLayerImpl
    * </pre>
    */
   private Set<SecurityLayerImpl> securityLayerImpl;
   
   public Set<SecurityLayerImpl> getSecurityLayerImpl() {
      if (this.securityLayerImpl == null) {
         this.securityLayerImpl = new HashSet<SecurityLayerImpl>();
      }
      return this.securityLayerImpl;
   }
   
   }

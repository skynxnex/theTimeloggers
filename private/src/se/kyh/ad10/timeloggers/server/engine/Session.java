package se.kyh.ad10.timeloggers.server.engine;

import se.kyh.ad10.timeloggersPublic.server.PublicInterface;

public class Session {
   private int UUID;
   
   public void setUUID(int value) {
      this.UUID = value;
   }
   
   public int getUUID() {
      return this.UUID;
   }
   
   private int userId;
   
   public void setUserId(int value) {
      this.userId = value;
   }
   
   public int getUserId() {
      return this.userId;
   }
   
   private int clientId;
   
   public void setClientId(int value) {
      this.clientId = value;
   }
   
   public int getClientId() {
      return this.clientId;
   }
   
   private PublicInterface publicInterface;
   
   public void setPublicInterface(PublicInterface value) {
      this.publicInterface = value;
   }
   
   public PublicInterface getPublicInterface() {
      return this.publicInterface;
   }
   
   }

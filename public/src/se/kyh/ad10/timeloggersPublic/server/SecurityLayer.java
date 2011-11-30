package se.kyh.ad10.timeloggersPublic.server;

import java.util.UUID;


public interface SecurityLayer {
   public PublicInterface getSession(int UUID);
   
   public UUID createSession();
   
   }

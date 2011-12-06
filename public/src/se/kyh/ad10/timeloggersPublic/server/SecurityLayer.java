package se.kyh.ad10.timeloggersPublic.server;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.UUID;

public interface SecurityLayer extends Remote, Serializable{
	
   public PublicInterface getPublicInterface(UUID sessionID) throws RemoteException;

   public UUID createSession() throws RemoteException;
   
   }

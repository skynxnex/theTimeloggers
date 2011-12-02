package se.kyh.ad10.timeloggersPublic.server;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.UUID;
// 2

public interface SecurityLayer extends Remote {
	
   public int getSession() throws RemoteException;
   
   public UUID createSession() throws RemoteException;
   
   }

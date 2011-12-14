package se.kyh.ad10.timeloggers.server.dao.intf;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PopulateDB extends Remote, Serializable {
	
	public void populateDB() throws RemoteException;
}

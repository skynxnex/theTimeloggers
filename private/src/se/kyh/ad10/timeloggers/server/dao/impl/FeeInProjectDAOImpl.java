package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.UUID;

import se.kyh.ad10.timeloggers.server.dao.intf.FeeInProjectDAO;
import se.kyh.ad10.timeloggers.server.entities.FeeInProject;

@SuppressWarnings("serial")
public class FeeInProjectDAOImpl extends UnicastRemoteObject implements FeeInProjectDAO {
	
	private UUID uuid;

	public FeeInProjectDAOImpl(UUID uuid) throws RemoteException {
		super();
		this.setUuid(uuid);
	}

	@Override
	public boolean saveFeeInProject(FeeInProject feeInProject) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteFeeInProject(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
}

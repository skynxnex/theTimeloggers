package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import se.kyh.ad10.timeloggers.server.dao.intf.FeeInProjectDAO;
import se.kyh.ad10.timeloggers.server.entities.FeeInProject;

@SuppressWarnings("serial")
public class FeeInProjectDAOImpl extends UnicastRemoteObject implements FeeInProjectDAO {

	protected FeeInProjectDAOImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
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
}

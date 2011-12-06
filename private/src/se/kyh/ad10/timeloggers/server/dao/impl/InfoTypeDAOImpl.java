package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashSet;
import java.util.Set;

import se.kyh.ad10.timeloggers.server.dao.intf.InfoTypeDAO;
import se.kyh.ad10.timeloggers.server.entities.InfoType;

@SuppressWarnings("serial")
public class InfoTypeDAOImpl extends UnicastRemoteObject implements InfoTypeDAO {

	protected InfoTypeDAOImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	private Set<InfoType> infoType;

	public Set<InfoType> getInfoType() {
		if (this.infoType == null) {
			this.infoType = new HashSet<InfoType>();
		}
		return this.infoType;
	}

	@Override
	public boolean saveInfoType(InfoType infoType) {
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

package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import se.kyh.ad10.timeloggers.server.dao.intf.InfoTypeDAO;
import se.kyh.ad10.timeloggers.server.entities.InfoType;

@SuppressWarnings("serial")
public class InfoTypeDAOImpl extends UnicastRemoteObject implements InfoTypeDAO {
	
	private UUID uuid;

	public InfoTypeDAOImpl(UUID uuid) throws RemoteException {
		super();
		this.setUuid(uuid);
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

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

}

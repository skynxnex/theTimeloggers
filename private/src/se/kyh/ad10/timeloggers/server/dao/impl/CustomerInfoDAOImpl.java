package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.UUID;

import se.kyh.ad10.timeloggers.server.dao.intf.CustomerInfoDAO;
import se.kyh.ad10.timeloggers.server.entities.Customer;
import se.kyh.ad10.timeloggers.server.entities.CustomerInfo;

@SuppressWarnings("serial")
public class CustomerInfoDAOImpl extends UnicastRemoteObject implements CustomerInfoDAO {
	
	private UUID uuid;

	public CustomerInfoDAOImpl(UUID uuid) throws RemoteException {
		super();
		this.setUuid(uuid);
	}

	@Override
	public boolean saveCustomerInfo(CustomerInfo customerInfo) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteCustomerInfo(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Customer> listCustomerInfoByCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}
}

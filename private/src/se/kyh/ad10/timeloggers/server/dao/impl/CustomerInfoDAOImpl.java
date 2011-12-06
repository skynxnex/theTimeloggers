package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import se.kyh.ad10.timeloggers.server.dao.intf.CustomerInfoDAO;
import se.kyh.ad10.timeloggers.server.entities.Customer;

public class CustomerInfoDAOImpl extends UnicastRemoteObject implements CustomerInfoDAO {

	protected CustomerInfoDAOImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean saveCustomerInfo(String value, int customerId, int infoTypeId) {
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
}

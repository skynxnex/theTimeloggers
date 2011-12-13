package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import java.util.UUID;

import se.kyh.ad10.timeloggers.server.dao.intf.CustomerDAO;
import se.kyh.ad10.timeloggers.server.entities.Customer;

@SuppressWarnings("serial")
public class CustomerDAOImpl extends UnicastRemoteObject implements CustomerDAO {
	
	private UUID uuid;

	public CustomerDAOImpl(UUID uuid) throws RemoteException {
		super();
		this.setUuid(uuid);
	}


	@Override
	public boolean saveCustomer(String name) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changeCustomerActivityStatus(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer getCustomer(int id) {
		// TODO Auto-generated method stub
		Customer customer = new Customer();
		customer.setName("Linda");
		return customer;
	}

	@Override
	public List<Customer> getAllCustomers() {
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

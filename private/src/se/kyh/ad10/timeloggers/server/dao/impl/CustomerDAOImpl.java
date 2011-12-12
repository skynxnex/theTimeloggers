package se.kyh.ad10.timeloggers.server.dao.impl;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import se.kyh.ad10.timeloggers.server.dao.intf.CustomerDAO;
import se.kyh.ad10.timeloggers.server.entities.Customer;

@SuppressWarnings("serial")
public class CustomerDAOImpl extends UnicastRemoteObject implements CustomerDAO {

	public CustomerDAOImpl() throws RemoteException {
		super();
		// TODO Auto-generated constructor stub
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
}

package se.kyh.ad10.timeloggers.server.dao.impl;

import java.util.List;

import se.kyh.ad10.timeloggers.server.dao.intf.CustomerDAO;
import se.kyh.ad10.timeloggers.server.db.DB;
import se.kyh.ad10.timeloggers.server.entities.Customer;

public class CustomerDAOImpl extends DB implements CustomerDAO {

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
		return null;
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return null;
	}
}

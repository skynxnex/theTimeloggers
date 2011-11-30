package se.kyh.ad10.timeloggers.server.dao.impl;

import java.util.List;

import se.kyh.ad10.timeloggers.server.dao.intf.CustomerInfoDAO;
import se.kyh.ad10.timeloggers.server.db.DB;

public class CustomerInfoDAOImpl extends DB implements CustomerInfoDAO {

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
	public List listCustomerInfoByCustomer(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}

package se.kyh.ad10.timeloggers.server.dao.impl;

import java.util.List;

import se.kyh.ad10.timeloggers.server.dao.intf.UserDAO;
import se.kyh.ad10.timeloggers.server.db.DB;
import se.kyh.ad10.timeloggers.server.entities.Role;
import se.kyh.ad10.timeloggers.server.entities.User;

public class UserDAOImpl extends DB implements UserDAO {

	@Override
	public void getUserById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User login(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveUser(User user) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean inactivateUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean activateUser(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Role> getUserRolesInProject(int userId, int projectId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List getUsersForProject(int projectId) {
		// TODO Auto-generated method stub
		return null;
	}
}

package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

@SuppressWarnings("serial")
public class User implements Serializable {
	private String email;
	private String firstName;
	private int id;
	private Set<UserInfo> info;
	private String lastName;
	private String password;
	private String plainPassword;
	private Set<SystemAdminLevel> systemAdminLevelImpl;
	private Set<UserInfo> userInfo;
	private Set<UserInProject> userInProject;
	private Set<AttendedTime> userRoleInProjectImpl;

	public String encryptPassword(String pass) {
		// TODO implement this operation
		throw new UnsupportedOperationException("not implemented");
	}

	public String getEmail() {
		return this.email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public int getId() {
		return this.id;
	}

	public Set<UserInfo> getInfo() {
		if (this.info == null) {
			this.info = new HashSet<UserInfo>();
		}
		return this.info;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public String getPlainPassword() {
		return this.plainPassword;
	}

	public Set<SystemAdminLevel> getSystemAdminLevelImpl() {
		if (this.systemAdminLevelImpl == null) {
			this.systemAdminLevelImpl = new HashSet<SystemAdminLevel>();
		}
		return this.systemAdminLevelImpl;
	}

	public Set<UserInfo> getUserInfo() {
		if (this.userInfo == null) {
			this.userInfo = new HashSet<UserInfo>();
		}
		return this.userInfo;
	}

	public Set<UserInProject> getUserInProject() {
		if (this.userInProject == null) {
			this.userInProject = new HashSet<UserInProject>();
		}
		return this.userInProject;
	}

	public Set<AttendedTime> getUserRoleInProjectImpl() {
		if (this.userRoleInProjectImpl == null) {
			this.userRoleInProjectImpl = new HashSet<AttendedTime>();
		}
		return this.userRoleInProjectImpl;
	}

	public void setEmail(String value) {
		this.email = value;
	}

	public void setFirstName(String value) {
		this.firstName = value;
	}

	public void setId(int value) {
		this.id = value;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setPassword(String value) {
		this.password = value;
	}

	public void setPlainPassword(String value) {
		this.plainPassword = value;
	}

}

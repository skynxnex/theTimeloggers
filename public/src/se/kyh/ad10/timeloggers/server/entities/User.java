package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "user")
@Embeddable
public class User implements Serializable {
	
	/*---------------------*/
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "plain_password")
	private String plainPassword;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@OneToMany
	@Basic(fetch = FetchType.EAGER)
	private List<AttendedTime> attendedTimes;
	
	// @Column(name = "")
//	private Set<UserInfo> info;
	
	// @Column(name = "user_id")
//	private Set<SystemAdminLevel> systemAdminLevelImpl;
	
//	@Column(name = "user_id")
//	private Set<UserInfo> userInfo;
	
//	@Column(name = "user_id")
//	private Set<UserInProject> userInProject;
	
//	@Column(name = "user_id")
//	private Set<AttendedTime> userRoleInProjectImpl;
	
	/*---------------------*/
	
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

//	public Set<UserInfo> getInfo() {
//		if (this.info == null) {
//			this.info = new HashSet<UserInfo>();
//		}
//		return this.info;
//	}

	public String getLastName() {
		return lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public String getPlainPassword() {
		return this.plainPassword;
	}

//	public Set<SystemAdminLevel> getSystemAdminLevelImpl() {
//		if (this.systemAdminLevelImpl == null) {
//			this.systemAdminLevelImpl = new HashSet<SystemAdminLevel>();
//		}
//		return this.systemAdminLevelImpl;
//	}

//	public Set<UserInfo> getUserInfo() {
//		if (this.userInfo == null) {
//			this.userInfo = new HashSet<UserInfo>();
//		}
//		return this.userInfo;
//	}

//	public Set<UserInProject> getUserInProject() {
//		if (this.userInProject == null) {
//			this.userInProject = new HashSet<UserInProject>();
//		}
//		return this.userInProject;
//	}

//	public Set<AttendedTime> getUserRoleInProjectImpl() {
//		if (this.userRoleInProjectImpl == null) {
//			this.userRoleInProjectImpl = new HashSet<AttendedTime>();
//		}
//		return this.userRoleInProjectImpl;
//	}

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

	public List<AttendedTime> getAttendedTimes() {
		return attendedTimes;
	}

	public void setAttendedTimes(List<AttendedTime> attendedTimes) {
		this.attendedTimes = attendedTimes;
	}

}

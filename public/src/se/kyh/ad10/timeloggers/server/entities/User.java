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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
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
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn
	private List<UserInfo> userInfo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn
	private List<SystemAdminLevel> systemAdminLevel;
	
	@OneToMany
	@JoinColumn
	private List<UserInProject> userInProject;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn
	private List<AttendedTime> attendedTime;
	
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

	public String getLastName() {
		return lastName;
	}

	public String getPassword() {
		return this.password;
	}

	public String getPlainPassword() {
		return this.plainPassword;
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
	
	public List<UserInfo> getUserInfo() {
		return this.userInfo;
	}

	public List<SystemAdminLevel> getSystemAdminLevel() {
		return this.systemAdminLevel;
	}

	public List<UserInProject> getUserInProject() {
		return this.userInProject;
	}

	public List<AttendedTime> getAttendedTime() {
		return this.attendedTime;
	}

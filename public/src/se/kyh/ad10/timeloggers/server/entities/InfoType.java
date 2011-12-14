package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "info_type")
@Embeddable
public class InfoType implements Serializable {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany
	@JoinColumn
	private List<UserInfo> userInfo;
	
	@OneToMany
	@JoinColumn
	private List<CustomerInfo> customerInfo;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public List<UserInfo> getUserInfo() {
		return this.userInfo;
	}

	public List<CustomerInfo> getCustomerInfo() {
		return customerInfo;
	}

	public void setCustomerInfo(List<CustomerInfo> customerInfo) {
		this.customerInfo = customerInfo;
	}

	public void setUserInfo(List<UserInfo> userInfo) {
		this.userInfo = userInfo;
	}
}

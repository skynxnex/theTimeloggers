package se.kyh.ad10.timeloggers.server.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "info_type")
@Embeddable
public class InfoType {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn
	private List<UserInfo> userInfo;
	
	@OneToMany(fetch = FetchType.LAZY)
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
		return this.customerInfo;
	}
}

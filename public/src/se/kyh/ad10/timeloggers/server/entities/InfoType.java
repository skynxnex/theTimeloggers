package se.kyh.ad10.timeloggers.server.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
//	private Set<CustomerInfo> customerInfoImpl;
//	private Set<UserInfo> info;
//	private Set<UserInfo> userInfo;

//	public Set<CustomerInfo> getCustomerInfoImpl() {
//		if (this.customerInfoImpl == null) {
//			this.customerInfoImpl = new HashSet<CustomerInfo>();
//		}
//		return this.customerInfoImpl;
//	}

	public int getId() {
		return this.id;
	}

//	public Set<UserInfo> getInfo() {
//		if (this.info == null) {
//			this.info = new HashSet<UserInfo>();
//		}
//		return this.info;
//	}

	public String getName() {
		return this.name;
	}

//	public Set<UserInfo> getUserInfo() {
//		if (this.userInfo == null) {
//			this.userInfo = new HashSet<UserInfo>();
//		}
//		return this.userInfo;
//	}

	public void setId(int value) {
		this.id = value;
	}

	public void setName(String value) {
		this.name = value;
	}

}

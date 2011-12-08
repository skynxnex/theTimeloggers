package se.kyh.ad10.timeloggers.server.entities;

import java.util.HashSet;
import java.util.Set;

public class InfoType {
	private Set<CustomerInfo> customerInfoImpl;
	private int id;
	private Set<UserInfo> info;
	private String name;
	private Set<UserInfo> userInfo;

	public Set<CustomerInfo> getCustomerInfoImpl() {
		if (this.customerInfoImpl == null) {
			this.customerInfoImpl = new HashSet<CustomerInfo>();
		}
		return this.customerInfoImpl;
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

	public String getName() {
		return this.name;
	}

	public Set<UserInfo> getUserInfo() {
		if (this.userInfo == null) {
			this.userInfo = new HashSet<UserInfo>();
		}
		return this.userInfo;
	}

	public void setId(int value) {
		this.id = value;
	}

	public void setName(String value) {
		this.name = value;
	}

}

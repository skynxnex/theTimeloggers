package se.kyh.ad10.timeloggers.server.entities;

import java.util.Set;
import java.util.HashSet;

public class CustomerInfo {
	private Set<Customer> customer;
	private int customerId;
	private int id;
	private int infoTypeId;
	private Set<InfoType> infoTypeImpl;
	private String value;

	public Set<Customer> getCustomer() {
		if (this.customer == null) {
			this.customer = new HashSet<Customer>();
		}
		return this.customer;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public int getId() {
		return this.id;
	}

	public int getInfoTypeId() {
		return this.infoTypeId;
	}

	public Set<InfoType> getInfoTypeImpl() {
		if (this.infoTypeImpl == null) {
			this.infoTypeImpl = new HashSet<InfoType>();
		}
		return this.infoTypeImpl;
	}

	public String getValue() {
		return this.value;
	}

	public void setCustomerId(int value) {
		this.customerId = value;
	}

	public void setId(int value) {
		this.id = value;
	}

	public void setInfoTypeId(int value) {
		this.infoTypeId = value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}

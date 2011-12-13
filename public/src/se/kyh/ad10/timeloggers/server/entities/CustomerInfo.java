package se.kyh.ad10.timeloggers.server.entities;

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
import javax.persistence.Table;

@Entity
@Table(name = "customer_info")
@Embeddable
public class CustomerInfo {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "value")
	private String value;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn
	private List<Customer> customer;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn
	private List<InfoType> infoType;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public List<Customer> getCustomer() {
		return this.customer;
	}

	public List<InfoType> getInfoTypeImpl() {
		return this.infoType;
	}
}

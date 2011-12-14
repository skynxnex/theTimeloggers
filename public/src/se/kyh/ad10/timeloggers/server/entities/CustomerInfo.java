package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "customer_info")
@Embeddable
public class CustomerInfo implements Serializable {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "value")
	private String value;

	@ManyToOne
	@JoinColumn
	private Customer customer;
	
	@ManyToOne
	@JoinColumn
	private InfoType infoType;

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
	
	public Customer getCustomer() {
		return this.customer;
	}

	public InfoType getInfoTypeImpl() {
		return this.infoType;
	}
}

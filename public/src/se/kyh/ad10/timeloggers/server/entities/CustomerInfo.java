package se.kyh.ad10.timeloggers.server.entities;

import java.util.Set;
import java.util.HashSet;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "customer_info")
public class CustomerInfo {
	
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	@Basic(fetch = FetchType.EAGER)
	private Customer customer;
	
	@Column(name = "value")
	private String value;
	
	@ManyToOne
	@JoinColumn(name = "infotype_id")
	@Basic(fetch = FetchType.EAGER)
	private InfoType infoType;
	
//	private Set<Customer> customer;
//	private Set<InfoType> infoTypeImpl;
	

//	public Set<Customer> getCustomer() {
//		if (this.customer == null) {
//			this.customer = new HashSet<Customer>();
//		}
//		return this.customer;
//	}



	public int getId() {
		return this.id;
	}


//	public Set<InfoType> getInfoTypeImpl() {
//		if (this.infoTypeImpl == null) {
//			this.infoTypeImpl = new HashSet<InfoType>();
//		}
//		return this.infoTypeImpl;
//	}

	public String getValue() {
		return this.value;
	}

	public void setId(int value) {
		this.id = value;
	}


	public void setValue(String value) {
		this.value = value;
	}


	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	public InfoType getInfoType() {
		return infoType;
	}


	public void setInfoType(InfoType infoType) {
		this.infoType = infoType;
	}

}

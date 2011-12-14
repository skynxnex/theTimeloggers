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
@Table(name = "user_info")
@Embeddable
public class UserInfo implements Serializable {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "value")
	private String value;
		
	@ManyToOne
	@JoinColumn
	private User user;
	
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

	public InfoType getInfoType() {
		return this.infoType;
	}
	
	public User getUser() {
		return this.user;
	}
}

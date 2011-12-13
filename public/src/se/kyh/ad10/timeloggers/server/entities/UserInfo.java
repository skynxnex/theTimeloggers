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
@Table(name = "user_info")
@Embeddable
public class UserInfo {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "value")
	private String value;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "info_type_id")
	private List<InfoType> infoType;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "user_id")
	private List<User> user;
	
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

	public List<InfoType> getInfoType() {
		return this.infoType;
	}
	
	public List<User> getUser() {
		return this.user;
	}
}

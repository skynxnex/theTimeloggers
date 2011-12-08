package se.kyh.ad10.timeloggers.server.entities;

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
	
	@ManyToOne
	@JoinColumn(name = "info_type_id")
	@Basic(fetch = FetchType.EAGER)
	private InfoType infoType;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	@Basic(fetch = FetchType.EAGER)
	private User user;
	
	@Column(name = "value")
	private String value;
	
//	private Set<InfoType> infoType;
//	private Set<User> user;

	public int getId() {
		return this.id;
	}

//	public Set<InfoType> getInfoType() {
//		if (this.infoType == null) {
//			this.infoType = new HashSet<InfoType>();
//		}
//		return this.infoType;
//	}


//	public Set<User> getUser() {
//		if (this.user == null) {
//			this.user = new HashSet<User>();
//		}
//		return this.user;
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

	public InfoType getInfoType() {
		return infoType;
	}

	public void setInfoType(InfoType infoType) {
		this.infoType = infoType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}

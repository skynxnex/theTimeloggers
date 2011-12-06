package se.kyh.ad10.timeloggers.server.entities;

import java.util.HashSet;
import java.util.Set;

public class UserInfo {
	private int id;
	private Set<InfoType> infoType;
	private int infoTypeId;
	private Set<User> user;
	private int userId;
	private String value;

	public int getId() {
		return this.id;
	}

	public Set<InfoType> getInfoType() {
		if (this.infoType == null) {
			this.infoType = new HashSet<InfoType>();
		}
		return this.infoType;
	}

	public int getInfoTypeId() {
		return this.infoTypeId;
	}

	public Set<User> getUser() {
		if (this.user == null) {
			this.user = new HashSet<User>();
		}
		return this.user;
	}

	public int getUserId() {
		return this.userId;
	}

	public String getValue() {
		return this.value;
	}

	public void setId(int value) {
		this.id = value;
	}

	public void setInfoTypeId(int value) {
		this.infoTypeId = value;
	}

	public void setUserId(int value) {
		this.userId = value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}

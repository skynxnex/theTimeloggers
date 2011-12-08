package se.kyh.ad10.timeloggers.server.entities;

import java.util.Set;
import java.util.HashSet;

public class SystemAdminLevel {
	private int id;
	private int level;
	private String name;
	private Set<User> userImpl;

	public int getId() {
		return this.id;
	}

	public int getLevel() {
		return this.level;
	}

	public String getName() {
		return this.name;
	}

	public Set<User> getUserImpl() {
		if (this.userImpl == null) {
			this.userImpl = new HashSet<User>();
		}
		return this.userImpl;
	}

	public void setId(int value) {
		this.id = value;
	}

	public void setLevel(int value) {
		this.level = value;
	}

	public void setName(String value) {
		this.name = value;
	}

}

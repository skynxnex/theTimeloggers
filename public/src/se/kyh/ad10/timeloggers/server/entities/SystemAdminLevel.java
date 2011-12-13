package se.kyh.ad10.timeloggers.server.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "system_admin_level")
@Embeddable
public class SystemAdminLevel {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "level")
	private int level;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn
	private List<User> user;

	public int getId() {
		return this.id;
	}

	public int getLevel() {
		return this.level;
	}

	public String getName() {
		return this.name;
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

	public List<User> getUser() {
		return this.user;
	}

}

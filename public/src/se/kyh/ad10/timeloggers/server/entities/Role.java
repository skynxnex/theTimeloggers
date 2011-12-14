package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "role")
@Embeddable
public class Role implements Serializable {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany
	@JoinColumn
	private List<FeeInProject> feeInProject;

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public void setId(int value) {
		this.id = value;
	}

	public void setName(String value) {
		this.name = value;
	}
	
	public List<FeeInProject> getFeeInProject() {
		return this.feeInProject;
	}
}

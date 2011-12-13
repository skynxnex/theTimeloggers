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
@Table(name = "role")
@Embeddable
public class Role {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "fee_in_project")
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

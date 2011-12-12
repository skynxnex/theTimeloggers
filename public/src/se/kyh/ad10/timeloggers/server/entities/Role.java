package se.kyh.ad10.timeloggers.server.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
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
	
//	private Set<FeeInProject> feeInProject;

//	public Set<FeeInProject> getFeeInProject() {
//		if (this.feeInProject == null) {
//			this.feeInProject = new HashSet<FeeInProject>();
//		}
//		return this.feeInProject;
//	}

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

}

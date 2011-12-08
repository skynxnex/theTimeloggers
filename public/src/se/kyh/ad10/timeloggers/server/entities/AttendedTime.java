package se.kyh.ad10.timeloggers.server.entities;

import java.io.Serializable;
import java.util.Set;
import java.util.HashSet;

import javax.persistence.Basic;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table(name = "attended_time")
@Embeddable
public class AttendedTime implements Serializable {
	
	@Id
	@GeneratedValue
	private int id;
	
	@ManyToOne
	@JoinColumn(name = "feeinproject_id")
	@Basic(fetch = FetchType.EAGER)
	private FeeInProject feeInProject;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	@Basic(fetch = FetchType.EAGER)
	private User user;
	
//	private Set<Timelog> timelog;
//	private Set<FeeInProject> feeInProject;
//	private Set<User> userImpl;

//	public Set<FeeInProject> getFeeInProject() {
//		if (this.feeInProject == null) {
//			this.feeInProject = new HashSet<FeeInProject>();
//		}
//		return this.feeInProject;
//	}

//	public int getFeeInProjectId() {
//		return this.feeInProjectId;
//	}

	public int getId() {
		return this.id;
	}

//	public Set<Timelog> getTimelog() {
//		if (this.timelog == null) {
//			this.timelog = new HashSet<Timelog>();
//		}
//		return this.timelog;
//	}


//	public Set<User> getUserImpl() {
//		if (this.userImpl == null) {
//			this.userImpl = new HashSet<User>();
//		}
//		return this.userImpl;
//	}

//	public void setFeeInProjectId(int value) {
//		this.feeInProjectId = value;
//	}

	public void setId(int value) {
		this.id = value;
	}

	public FeeInProject getFeeInProject() {
		return feeInProject;
	}

	public void setFeeInProject(FeeInProject feeInProject) {
		this.feeInProject = feeInProject;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}

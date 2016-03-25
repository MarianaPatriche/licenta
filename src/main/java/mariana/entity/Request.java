package mariana.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Created by mariana on 24.03.2016.
 */

@Entity
@Table(name = "REQUEST")
public class Request extends AbstractAuditable {

	@Id
	@GeneratedValue(generator = "REQUEST_SEQ_GEN", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "REQUEST_SEQ_GEN", sequenceName = "REQUEST_SEQ")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "PROJECT_ID")
	private Project project;

	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;

	@Column(name = "approved")
	private Boolean approved;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Boolean getApproved() {
		return approved;
	}

	public void setApproved(Boolean approved) {
		this.approved = approved;
	}
}

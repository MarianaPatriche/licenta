package mariana.entity;

import javax.persistence.*;

/**
 * Created by mariana on 17.03.2016.
 */
@Entity
@Table(name = "USER_ROLE")
public class UserRole {

	@Id
	@GeneratedValue(generator = "USER_ROLE_SEQ_GEN", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "USER_ROLE_SEQ_GEN", sequenceName = "USER_ROLE_SEQ")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "USER_ID")
	private User user;

	private String role;

	public UserRole(User user, String role) {
		this.user = user;
		this.role = role;
	}

	public UserRole() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
}

package mariana.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Created by mariana on 17.03.2016.
 */

@Entity
@Table(name = "USERS")
public class User {

	@Id
	@GeneratedValue(generator = "USER_SEQ_GEN", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "USER_SEQ_GEN", sequenceName = "USER_SEQ")
	private Long id;

	@Column(name = "USERNAME", unique = true, nullable = false)
	private String username;

	@Column(name = "PASSWORD", nullable = false)
	private String password;

	@Column(name = "ENABLED")
	private boolean enabled;

	public User(String username, String password, boolean enabled) {
		this.username = username;
		this.password = password;
		this.enabled = enabled;
	}

	public User() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}
}

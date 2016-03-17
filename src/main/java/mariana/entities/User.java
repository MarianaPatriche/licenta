package mariana.entities;

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
}

package mariana.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

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
	private User user;

	private String role;
}

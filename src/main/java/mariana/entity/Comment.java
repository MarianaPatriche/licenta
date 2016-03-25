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
 * Created by mariana on 25.03.2016.
 */

@Entity
@Table(name = "COMMENT")
public class Comment extends AbstractAuditable{

	@Id
	@GeneratedValue(generator = "COMMENT_SEQ_GEN", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "COMMENT_SEQ_GEN", sequenceName = "COMMENT_SEQ")
	private Long id;

	@Column(name = "COMMENT")
	private String comment;

	@ManyToOne
	@JoinColumn(name = "ID_PROJECT")
	private Project project;

	@ManyToOne
	@JoinColumn(name = "ID_USER")
	private User user;

}

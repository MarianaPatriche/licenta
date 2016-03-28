package mariana.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Created by mariana on 23.03.2016.
 */

@Entity
@Table(name = "PROJECT")
public class Project extends AbstractAuditable{

	@Id
	@GeneratedValue(generator = "PROJECT_SEQ_GEN", strategy = GenerationType.SEQUENCE)
	@SequenceGenerator(name = "PROJECT_SEQ_GEN", sequenceName = "PROJECT_SEQ")
	private Long id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "TECHNOLOGIES")
	private String technologies;

	@Column(name = "DAYS_TO_FINALIZE")
	private Long daysToFinalize;

	@Column(name = "NUMER_OF_PEOPLE")
	private Integer noOfPeople;

	@Column(name = "SPECIFICATIONS")
	private String specifications;

	@Column(name = "LANGUAGES")
	private String languages;

	@ManyToMany
	@JoinTable(name = "USER_PROJECT",
			joinColumns = {@JoinColumn(name = "USER_ID")},
			inverseJoinColumns = {@JoinColumn(name = "PROJECT_ID")})
	private Set<User> users;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTechnologies() {
		return technologies;
	}

	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}

	public Long getDaysToFinalize() {
		return daysToFinalize;
	}

	public void setDaysToFinalize(Long daysToFinalize) {
		this.daysToFinalize = daysToFinalize;
	}

	public Integer getNoOfPeople() {
		return noOfPeople;
	}

	public void setNoOfPeople(Integer noOfPeople) {
		this.noOfPeople = noOfPeople;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}

	public String getSpecifications() {
		return specifications;
	}

	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}
}

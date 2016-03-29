package mariana.entity;

import javax.persistence.*;

/**
 * Created by mariana on 27.03.2016.
 */

@Entity
@Table(name = "PROFILE")
public class UserProfile extends AbstractAuditable{

    @Id
    @GeneratedValue(generator = "PROFILE_SEQ_GEN", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "PROFILE_SEQ_GEN", sequenceName = "PROFILE_SEQ")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

	@Column(name = "FIRST_NAME")
	private String firstName;

	@Column(name = "LAST_NAME")
	private String lastName;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "BIRTHDAY")
	private String birthday;

	@Column(name = "EDUCATION")
	private String education;

	@Column(name = "EXPERIENCE")
	private String experience;

	@Column(name = "TECHNOLOGIES")
	private String technologies;

	@Column(name = "CITY")
	private String city;

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	@Column(name = "EMAIL")
	private String email;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getTechnologies() {
		return technologies;
	}

	public void setTechnologies(String technologies) {
		this.technologies = technologies;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}

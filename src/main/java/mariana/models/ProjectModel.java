package mariana.models;

import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.LocalDateTime;

import javax.validation.constraints.Min;

/**
 * Created by mariana on 27.03.2016.
 */
public class ProjectModel {
	private Long id;

	@NotEmpty(message = "Campul trebuie completat!")
	private String name;

	@NotEmpty(message = "Campul trebuie completat!")
	private String description;

	@NotEmpty(message = "Campul trebuie completat!")
	private String technologies;

	@Min(value = 1, message = "Campul trebuie sa contina o valoare mai mare decat 1!")
	private Long daysToFinalize;

	@Min(value = 1, message = "Campul trebuie sa contina o valoare mai mare decat 1!")
	private Integer noOfPeople;

	@NotEmpty(message = "Campul trebuie completat!")
	private String specifications;

	@NotEmpty(message = "Campul trebuie completat!")
	private String languages;

	private LocalDateTime createdDate;

	private String createdBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
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

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
}

package mariana.models;

import java.util.List;

/**
 * Created by mariana on 27.03.2016.
 */
public class ProjectModel{
    private Long id;
    private String name;
    private String description;
    private String programmingLanguage;
    private Long daysToFinalize;
    private Integer noOfPeople;
    private String initiator;

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

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
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

    public String getInitiator() {
        return initiator;
    }

    public void setInitiator(String initiator) {
        this.initiator = initiator;
    }
}

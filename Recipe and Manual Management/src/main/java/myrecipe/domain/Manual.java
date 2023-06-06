package myrecipe.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import myrecipe.RecipeAndManualManagementApplication;
import myrecipe.domain.ManualCreated;
import myrecipe.domain.ManualUpdated;

@Entity
@Table(name = "Manual_table")
@Data
public class Manual {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String recipeId;

    private String customerId;

    private Boolean isComplete;

    @PostPersist
    public void onPostPersist() {
        ManualCreated manualCreated = new ManualCreated(this);
        manualCreated.publishAfterCommit();

        ManualUpdated manualUpdated = new ManualUpdated(this);
        manualUpdated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static ManualRepository repository() {
        ManualRepository manualRepository = RecipeAndManualManagementApplication.applicationContext.getBean(
            ManualRepository.class
        );
        return manualRepository;
    }
}

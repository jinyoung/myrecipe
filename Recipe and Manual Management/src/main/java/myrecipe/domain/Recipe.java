package myrecipe.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import myrecipe.RecipeAndManualManagementApplication;
import myrecipe.domain.RecipeCreated;
import myrecipe.domain.RecipeDeleted;
import myrecipe.domain.RecipeUpdated;

@Entity
@Table(name = "Recipe_table")
@Data
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String name;

    private String description;

    private List<String> ingredients;

    private List<String> cookingSteps;

    @PostPersist
    public void onPostPersist() {
        RecipeCreated recipeCreated = new RecipeCreated(this);
        recipeCreated.publishAfterCommit();

        RecipeUpdated recipeUpdated = new RecipeUpdated(this);
        recipeUpdated.publishAfterCommit();

        RecipeDeleted recipeDeleted = new RecipeDeleted(this);
        recipeDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static RecipeRepository repository() {
        RecipeRepository recipeRepository = RecipeAndManualManagementApplication.applicationContext.getBean(
            RecipeRepository.class
        );
        return recipeRepository;
    }
}

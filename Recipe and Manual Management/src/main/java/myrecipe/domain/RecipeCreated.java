package myrecipe.domain;

import java.util.*;
import lombok.*;
import myrecipe.domain.*;
import myrecipe.infra.AbstractEvent;

@Data
@ToString
public class RecipeCreated extends AbstractEvent {

    private String id;
    private String name;
    private String description;
    private List<String> ingredients;
    private List<String> cookingSteps;

    public RecipeCreated(Recipe aggregate) {
        super(aggregate);
    }

    public RecipeCreated() {
        super();
    }
}

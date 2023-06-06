package myrecipe.domain;

import java.util.*;
import lombok.*;
import myrecipe.domain.*;
import myrecipe.infra.AbstractEvent;

@Data
@ToString
public class RecipeUpdated extends AbstractEvent {

    private String id;
    private String name;
    private String description;
    private List<String> ingredients;
    private List<String> cookingSteps;

    public RecipeUpdated(Recipe aggregate) {
        super(aggregate);
    }

    public RecipeUpdated() {
        super();
    }
}

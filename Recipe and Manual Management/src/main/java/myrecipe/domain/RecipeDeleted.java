package myrecipe.domain;

import java.util.*;
import lombok.*;
import myrecipe.domain.*;
import myrecipe.infra.AbstractEvent;

@Data
@ToString
public class RecipeDeleted extends AbstractEvent {

    private String id;

    public RecipeDeleted(Recipe aggregate) {
        super(aggregate);
    }

    public RecipeDeleted() {
        super();
    }
}

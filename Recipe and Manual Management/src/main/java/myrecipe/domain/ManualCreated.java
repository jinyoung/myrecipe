package myrecipe.domain;

import java.util.*;
import lombok.*;
import myrecipe.domain.*;
import myrecipe.infra.AbstractEvent;

@Data
@ToString
public class ManualCreated extends AbstractEvent {

    private String id;
    private String recipeId;
    private String customerId;
    private Boolean isComplete;

    public ManualCreated(Manual aggregate) {
        super(aggregate);
    }

    public ManualCreated() {
        super();
    }
}

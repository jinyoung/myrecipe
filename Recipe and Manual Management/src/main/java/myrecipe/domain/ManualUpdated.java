package myrecipe.domain;

import java.util.*;
import lombok.*;
import myrecipe.domain.*;
import myrecipe.infra.AbstractEvent;

@Data
@ToString
public class ManualUpdated extends AbstractEvent {

    private String id;
    private Boolean isComplete;

    public ManualUpdated(Manual aggregate) {
        super(aggregate);
    }

    public ManualUpdated() {
        super();
    }
}

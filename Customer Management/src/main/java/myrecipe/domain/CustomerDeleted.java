package myrecipe.domain;

import java.util.*;
import lombok.*;
import myrecipe.domain.*;
import myrecipe.infra.AbstractEvent;

@Data
@ToString
public class CustomerDeleted extends AbstractEvent {

    private String id;

    public CustomerDeleted(Customer aggregate) {
        super(aggregate);
    }

    public CustomerDeleted() {
        super();
    }
}

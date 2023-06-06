package myrecipe.domain;

import java.util.*;
import lombok.*;
import myrecipe.domain.*;
import myrecipe.infra.AbstractEvent;

@Data
@ToString
public class CustomerUpdated extends AbstractEvent {

    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private List<String> dietaryPreferences;

    public CustomerUpdated(Customer aggregate) {
        super(aggregate);
    }

    public CustomerUpdated() {
        super();
    }
}

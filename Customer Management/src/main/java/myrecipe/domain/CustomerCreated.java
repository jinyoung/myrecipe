package myrecipe.domain;

import java.util.*;
import lombok.*;
import myrecipe.domain.*;
import myrecipe.infra.AbstractEvent;

@Data
@ToString
public class CustomerCreated extends AbstractEvent {

    private String id;
    private String name;
    private String email;
    private String phone;
    private String address;
    private List<String> dietaryPreferences;

    public CustomerCreated(Customer aggregate) {
        super(aggregate);
    }

    public CustomerCreated() {
        super();
    }
}

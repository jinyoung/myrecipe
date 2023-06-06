package myrecipe.domain;

import java.util.*;
import lombok.*;
import myrecipe.domain.*;
import myrecipe.infra.AbstractEvent;

@Data
@ToString
public class DeliveryUpdated extends AbstractEvent {

    private String id;
    private Boolean isDelivered;

    public DeliveryUpdated(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryUpdated() {
        super();
    }
}

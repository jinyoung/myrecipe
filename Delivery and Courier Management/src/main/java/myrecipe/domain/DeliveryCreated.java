package myrecipe.domain;

import java.util.*;
import lombok.*;
import myrecipe.domain.*;
import myrecipe.infra.AbstractEvent;

@Data
@ToString
public class DeliveryCreated extends AbstractEvent {

    private String id;
    private String manualId;
    private Date deliveryDate;
    private String deliveryAddress;
    private Boolean isDelivered;

    public DeliveryCreated(Delivery aggregate) {
        super(aggregate);
    }

    public DeliveryCreated() {
        super();
    }
}

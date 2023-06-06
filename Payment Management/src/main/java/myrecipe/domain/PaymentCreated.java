package myrecipe.domain;

import java.util.*;
import lombok.*;
import myrecipe.domain.*;
import myrecipe.infra.AbstractEvent;

@Data
@ToString
public class PaymentCreated extends AbstractEvent {

    private String id;
    private String manualId;
    private Double amount;
    private Date paidDate;

    public PaymentCreated(Payment aggregate) {
        super(aggregate);
    }

    public PaymentCreated() {
        super();
    }
}

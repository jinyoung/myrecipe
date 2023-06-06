package myrecipe.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import myrecipe.PaymentManagementApplication;
import myrecipe.domain.PaymentCreated;
import myrecipe.domain.PaymentUpdated;

@Entity
@Table(name = "Payment_table")
@Data
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String manualId;

    private Double amount;

    private Date paidDate;

    @PostPersist
    public void onPostPersist() {
        PaymentCreated paymentCreated = new PaymentCreated(this);
        paymentCreated.publishAfterCommit();

        PaymentUpdated paymentUpdated = new PaymentUpdated(this);
        paymentUpdated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static PaymentRepository repository() {
        PaymentRepository paymentRepository = PaymentManagementApplication.applicationContext.getBean(
            PaymentRepository.class
        );
        return paymentRepository;
    }
}

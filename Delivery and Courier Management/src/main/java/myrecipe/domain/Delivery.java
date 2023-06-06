package myrecipe.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import myrecipe.DeliveryAndCourierManagementApplication;
import myrecipe.domain.DeliveryCreated;
import myrecipe.domain.DeliveryUpdated;

@Entity
@Table(name = "Delivery_table")
@Data
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String manualId;

    private Date deliveryDate;

    private String deliveryAddress;

    private Boolean isDelivered;

    @PostPersist
    public void onPostPersist() {
        DeliveryCreated deliveryCreated = new DeliveryCreated(this);
        deliveryCreated.publishAfterCommit();

        DeliveryUpdated deliveryUpdated = new DeliveryUpdated(this);
        deliveryUpdated.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = DeliveryAndCourierManagementApplication.applicationContext.getBean(
            DeliveryRepository.class
        );
        return deliveryRepository;
    }
}

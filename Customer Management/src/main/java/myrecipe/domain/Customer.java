package myrecipe.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import myrecipe.CustomerManagementApplication;
import myrecipe.domain.CustomerCreated;
import myrecipe.domain.CustomerDeleted;
import myrecipe.domain.CustomerUpdated;

@Entity
@Table(name = "Customer_table")
@Data
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String id;

    private String name;

    private String email;

    private String phone;

    private String address;

    private List<String> dietaryPreferences;

    @PostPersist
    public void onPostPersist() {
        CustomerCreated customerCreated = new CustomerCreated(this);
        customerCreated.publishAfterCommit();

        CustomerUpdated customerUpdated = new CustomerUpdated(this);
        customerUpdated.publishAfterCommit();

        CustomerDeleted customerDeleted = new CustomerDeleted(this);
        customerDeleted.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static CustomerRepository repository() {
        CustomerRepository customerRepository = CustomerManagementApplication.applicationContext.getBean(
            CustomerRepository.class
        );
        return customerRepository;
    }
}

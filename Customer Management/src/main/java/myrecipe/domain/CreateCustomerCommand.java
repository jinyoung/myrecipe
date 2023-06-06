package myrecipe.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Data
public class CreateCustomerCommand {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private String name;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private String email;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private String phone;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private String address;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private List&lt;String&gt; dietaryPreferences;


}

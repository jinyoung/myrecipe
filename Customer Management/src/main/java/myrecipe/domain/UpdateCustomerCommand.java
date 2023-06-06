package myrecipe.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Data
public class UpdateCustomerCommand {

        private String id;
        private String name;
        private String email;
        private String phone;
        private String address;
        private List&lt;String&gt; dietaryPreferences;


}

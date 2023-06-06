package myrecipe.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreatePaymentCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String manualId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Double amount;
}

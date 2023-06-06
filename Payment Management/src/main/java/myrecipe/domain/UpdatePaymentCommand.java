package myrecipe.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UpdatePaymentCommand {

    private String id;
    private Double amount;
    private Date paidDate;
}

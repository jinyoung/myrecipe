package myrecipe.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class CreateManualCommand {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String recipeId;

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private String customerId;
}

package myrecipe.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UpdateDeliveryCommand {

    private String id;
    private Boolean isDelivered;
}

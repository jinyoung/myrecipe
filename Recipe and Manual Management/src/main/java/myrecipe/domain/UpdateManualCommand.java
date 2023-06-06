package myrecipe.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Data
public class UpdateManualCommand {

    private String id;
    private Boolean isComplete;
}

package myrecipe.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Data
public class UpdateRecipeCommand {

        private String id;
        private String name;
        private String description;
        private List&lt;String&gt; ingredients;
        private List&lt;String&gt; cookingSteps;


}

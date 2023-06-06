package myrecipe.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;


@Data
public class CreateRecipeCommand {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private String name;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private String description;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private List&lt;String&gt; ingredients;
        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private List&lt;String&gt; cookingSteps;


}

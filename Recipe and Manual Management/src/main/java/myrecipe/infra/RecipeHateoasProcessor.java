package myrecipe.infra;

import myrecipe.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class RecipeHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Recipe>> {

    @Override
    public EntityModel<Recipe> process(EntityModel<Recipe> model) {
        return model;
    }
}

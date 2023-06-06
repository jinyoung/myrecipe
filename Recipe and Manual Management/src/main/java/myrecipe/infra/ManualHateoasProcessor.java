package myrecipe.infra;

import myrecipe.domain.*;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;

@Component
public class ManualHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Manual>> {

    @Override
    public EntityModel<Manual> process(EntityModel<Manual> model) {
        return model;
    }
}

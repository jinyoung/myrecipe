package myrecipe.domain;

import myrecipe.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "manuals", path = "manuals")
public interface ManualRepository
    extends PagingAndSortingRepository<Manual, String> {}

package de.llggiessen.mke.repository;

import de.llggiessen.mke.schema.Inventory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;


@Repository
@RepositoryRestResource(exported = false)
public interface InventoryRepository extends CrudRepository<Inventory, Long> {

}

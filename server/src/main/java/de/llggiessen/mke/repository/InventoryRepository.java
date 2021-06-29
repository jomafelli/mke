package de.llggiessen.mke.repository;

import de.llggiessen.mke.schema.Inventory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;


@NoRepositoryBean
public interface InventoryRepository<T extends Inventory> extends CrudRepository<T, Long> {

}

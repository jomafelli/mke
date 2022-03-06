package de.llggiessen.mke.repository;

import de.llggiessen.mke.schema.Boat;
import de.llggiessen.mke.schema.Inventory;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;


@NoRepositoryBean
public interface InventoryRepository<T extends Inventory> extends CrudRepository<T, Long> {
// in welchem Jqahr Trailor & Boat gebaut wurde

    @Query(value = "SELECT * FROM inventory WHERE inventory.year = :year", nativeQuery = true)
    Iterable<Inventory> findAllByYear(@Param("year") int year);

    @Query(value = "SELECT * FROM inventory WHERE inventory.id = :id", nativeQuery = true)
    Iterable<Inventory> findAllById(@Param("id") int id);

}

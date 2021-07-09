package de.llggiessen.mke.repository;

import de.llggiessen.mke.schema.Inventory;
import de.llggiessen.mke.schema.Trailer;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface TrailerRepository extends InventoryRepository<Trailer> {
@Modifying
    @Query(value = "SELECT * FROM Trailer WHERE trailer.places = :places", nativeQuery = true)
    Iterable<Trailer> findAllByPlaces(@Param("places") String places);

    @Query(value = "SELECT * FROM trailer WHERE trailer.price = :price", nativeQuery = true)
    Iterable<Trailer> findAllByPrice(@Param("price") float price);
}

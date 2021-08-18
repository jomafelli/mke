package de.llggiessen.mke.repository;

import de.llggiessen.mke.schema.Boat;
import de.llggiessen.mke.schema.Trailer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface TrailerRepository extends InventoryRepository<Trailer> {

    @Query(value = "SELECT * FROM trailer NATURAL JOIN inventory WHERE trailer.places = :places", nativeQuery = true)
    Iterable<Trailer> findAllByPlaces(@Param("places") int places);

    @Query(value = "SELECT * FROM trailer NATURAL JOIN inventory WHERE trailer.price = :price", nativeQuery = true)
    Iterable<Trailer> findAllByPrice(@Param("price") int price);
}

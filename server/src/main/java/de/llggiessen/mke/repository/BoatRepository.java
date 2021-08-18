package de.llggiessen.mke.repository;

import de.llggiessen.mke.schema.Boat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BoatRepository extends InventoryRepository<Boat>{

    @Query(value = "SELECT * FROM boat NATURAL JOIN inventory WHERE boat.seats = :seats", nativeQuery = true)
    Iterable<Boat> findAllBySeats(@Param("seats") int seats);

    @Query(value = "SELECT * FROM boat NATURAL JOIN inventory WHERE boat.status = :status", nativeQuery = true)
    Iterable<Boat> findAllByStatus(@Param("status") String status);
}

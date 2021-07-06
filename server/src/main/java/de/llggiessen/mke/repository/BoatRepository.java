package de.llggiessen.mke.repository;

import de.llggiessen.mke.schema.Boat;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BoatRepository extends InventoryRepository<Boat>{

    @Modifying
    @Query(value = "SELECT * FROM boat WHERE boat.seats = :seats", nativeQuery = true)
    Iterable<Boat> findAllBySeats(@Param("seats") int seats);

    @Query(value = "SELECT * FROM boat WHERE boat.status = 'GOOD' OR boat.status = 'BROKEN'", nativeQuery = true)
    Iterable<Boat> findAllByStatus(@Param("status") Boat.Status status);
}

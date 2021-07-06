package de.llggiessen.mke.repository;

import de.llggiessen.mke.schema.Boat;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BoatRepository extends InventoryRepository<Boat>{

    @Modifying
    @Query(value = "SELECT * FROM boat WHERE boat.seats = 4", nativeQuery = true)
    Iterable<Boat> findAllBySeats4(@Param("seats") int seats);

    @Query(value = "SELECT * FROM boat WHERE boat.seats = 3", nativeQuery = true)
    Iterable<Boat> findAllBySeats3(@Param("seats") int seats);

    @Query(value = "SELECT * FROM boat WHERE boat.status = 'GOOD'", nativeQuery = true)
    Iterable<Boat> findAllByStatusGOOD(@Param("status") Boat.Status status);

    @Query(value = "SELECT * FROM boat WHERE boat.status = 'BROKEN'", nativeQuery = true)
    Iterable<Boat> findAllByStatusBROKEN(@Param("status") Boat.Status status);
}

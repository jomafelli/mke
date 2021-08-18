package de.llggiessen.mke.repository;

import de.llggiessen.mke.schema.SpaceUtilisationField;
import de.llggiessen.mke.schema.Trailer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SpaceUtilisationFieldRepository extends InventoryRepository<SpaceUtilisationField> {

    @Query(value = "SELECT * FROM space_utilisation_field NATURAL JOIN inventory WHERE space_utilisation_field.type = :type", nativeQuery = true)
    Iterable<SpaceUtilisationField> findAllByType(@Param("type") String type);
}

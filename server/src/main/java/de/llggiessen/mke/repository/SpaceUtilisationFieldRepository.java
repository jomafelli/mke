package de.llggiessen.mke.repository;

import de.llggiessen.mke.schema.Inventory;
import de.llggiessen.mke.schema.SpaceUtilisationField;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface SpaceUtilisationFieldRepository extends InventoryRepository<SpaceUtilisationField> {
    @Query(value = "SELECT * FROM SpaceUtilisationField WHERE SpaceUtilisationField.type = :type", nativeQuery = true)
    Iterable<SpaceUtilisationField> findAllByType(@Param("type") String spaceUtilisationField);
}

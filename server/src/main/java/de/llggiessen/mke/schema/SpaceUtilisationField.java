package de.llggiessen.mke.schema;


import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;

@EqualsAndHashCode (callSuper = true)
@Data
@NoArgsConstructor
@Entity
public class SpaceUtilisationField extends Inventory{

    private String type;

    @Builder
    public SpaceUtilisationField(Long id, String year, String type) {
        super(id, year);
         this.type = type;
    }
}

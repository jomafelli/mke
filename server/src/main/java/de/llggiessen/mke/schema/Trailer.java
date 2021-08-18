package de.llggiessen.mke.schema;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.Year;

@NoArgsConstructor
@EqualsAndHashCode (callSuper = true)
@Data
@Entity
public class Trailer extends Inventory {

    private int price;
    private int places;

    @Builder
    public Trailer(Long id, String year, int places, int price) {
        super(id, year);
        this.places = places;
        this.price = price;
    }
}

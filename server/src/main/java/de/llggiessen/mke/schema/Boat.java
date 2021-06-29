package de.llggiessen.mke.schema;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.time.Year;

@Data
@NoArgsConstructor
@Entity
@EqualsAndHashCode (callSuper = true)
public class Boat extends Inventory {
    private int seats;

    @Builder
    public Boat(Long id, int seats, Year year, String condition) {
        super(id, year, condition);
        this.seats = seats;
    }

}

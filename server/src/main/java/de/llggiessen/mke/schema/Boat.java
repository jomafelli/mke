package de.llggiessen.mke.schema;

import lombok.*;

import javax.persistence.Entity;


@Data
@NoArgsConstructor
@Entity
@EqualsAndHashCode (callSuper = true)
public class Boat extends Inventory {
    private int seats;
    private String status;

    @Builder
    public Boat(Long id, String year, String status, int seats) {
        super(id, year);
        this.seats = seats;
        this.status = status;
    }

}

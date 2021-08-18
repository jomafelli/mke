package de.llggiessen.mke.schema;

import lombok.*;


import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


@Data
@NoArgsConstructor
@Entity
@EqualsAndHashCode (callSuper = true)
public class Boat extends Inventory {

    public enum Status {
        GOOD,
        BROKEN
    }

    @Enumerated (EnumType.STRING)
    private Status status;
    private int seats;


    @Builder
    public Boat(Long id, String year, Status status, int seats) {
        super(id, year);
        this.seats = seats;
        this.status = status;
    }

}

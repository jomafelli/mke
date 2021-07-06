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
    private int seats;

    public enum Status {
        GOOD,
        BROKEN
    }

    private Status status;

    @Builder
    public Boat(Long id, String year, Status status, int seats) {
        super(id, year);
        this.seats = seats;
        this.status = status;
    }

}

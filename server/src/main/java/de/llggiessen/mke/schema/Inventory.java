package de.llggiessen.mke.schema;

import javax.persistence.*;
import java.time.Year;

@Entity
public class Inventory {

    @Id
    @GeneratedValue
    private Long id;
    @OneToMany
    @JoinColumn (name = "status_id")
    @OneToMany
    @JoinColumn (name = "boat_id")
    private Year year;
    private String condition;

    public Inventory(Long id, Year year) {
        this.id = id;
        this.year = year;
    }
}

package de.llggiessen.mke.schema;

import javax.persistence.*;
import java.time.Year;

@Entity
public class Inventory {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn (name = "space_id", referencedColumnName = "id")
    private Space space;
    @ManyToOne
    @JoinColumn (name = "boat_id", referencedColumnName = "id")
    private Boat boat;
    @ManyToOne
    @JoinColumn (name = "trailer_id", referencedColumnName = "id")
    private Trailer trailer;
    private Year year;
    private String condition;

    public Inventory(Long id, Year year) {
        this.id = id;
        this.year = year;
    }
}

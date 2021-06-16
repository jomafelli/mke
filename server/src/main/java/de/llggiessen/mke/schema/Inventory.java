package de.llggiessen.mke.schema;

import lombok.Data;

import javax.persistence.*;
import java.time.Year;

@Entity
public class Inventory {

    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne
    @JoinColumn (name = "spaceUtilisationField_id", referencedColumnName = "id")
    private SpaceUtilisationField spaceUtilisationField;
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

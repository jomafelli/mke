package de.llggiessen.mke.schema;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Year;

@Data
@NoArgsConstructor
@Inheritance (strategy = InheritanceType.JOINED)
@Entity
public abstract class Inventory {

    @Id
    @GeneratedValue
    private Long id;
    private Year year;
    private String condition;

    public Inventory(Long id, Year year, String condition) {
        this.id = id;
        this.year = year;
        this.condition = condition;
    }
    /*@Id
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
    @ManyToOne
    @JoinColumn (name = "location_id", referencedColumnName = "id")
    private Location location;
    private Year year;
    private String condition;

    public Inventory(Long id, Year year) {
        this.id = id;
        this.year = year;
    }*/


}

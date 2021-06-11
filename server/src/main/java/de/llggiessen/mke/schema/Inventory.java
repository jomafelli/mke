package de.llggiessen.mke.schema;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.Year;

@Entity
public class Inventory {

    @Id
    @GeneratedValue
    private Long id;
    @ForeignKey
    private Long id;
    private Year year;
    private String status;

    @ForeignKey
    private
}

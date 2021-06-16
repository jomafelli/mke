package de.llggiessen.mke.schema;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Boat {

    @Id
    @GeneratedValue
    private long id;
    private int seats;

}

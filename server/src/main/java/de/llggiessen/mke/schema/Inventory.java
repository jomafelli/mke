package de.llggiessen.mke.schema;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Data
@NoArgsConstructor
@Inheritance (strategy = InheritanceType.JOINED)
@Entity
public class Inventory {

    @Id
    @GeneratedValue
    private Long id;
    private String year;

    public Inventory(Long id, String year) {
        this.year = year;
    }

    public Long getId() { return id;}
}

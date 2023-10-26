package de.krasosu.jpa.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Evani extends BaseEntity {

    @OneToOne(mappedBy = "evani", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Frelan frelan;
}

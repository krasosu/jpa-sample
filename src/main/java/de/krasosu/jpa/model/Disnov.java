package de.krasosu.jpa.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Disnov extends BaseEntity {

/*    @ManyToMany( fetch = FetchType.LAZY)
    private List<Evani> evanis;*/
}

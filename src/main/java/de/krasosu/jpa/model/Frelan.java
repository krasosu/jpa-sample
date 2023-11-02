package de.krasosu.jpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Frelan extends BaseEntity {

    @OneToMany(cascade = {CascadeType.PERSIST,  CascadeType.REMOVE}, fetch = FetchType.LAZY)
    @JoinColumn(name = "FRELAN_ID")
    private List<Evani> evani;
}

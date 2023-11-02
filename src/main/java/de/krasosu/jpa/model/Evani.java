package de.krasosu.jpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Evani extends BaseEntity {

/*    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    }, fetch = FetchType.EAGER
            *//*mappedBy = "evanis"*//*
    )
    private List<Disnov> disnovs;*/

    @ManyToMany( fetch = FetchType.LAZY)
    private List<Disnov> disnovs;

}

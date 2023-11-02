package de.krasosu.jpa.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.annotation.processing.Generated;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Renwick extends BaseEntity {

    @OneToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "RENWICK_ID")
    private List<Intira> intiras;

    @OneToMany(cascade = {CascadeType.ALL}, orphanRemoval = true, fetch = FetchType.LAZY)
    @JoinColumn(name = "RENWICK_ID")
    private List<Disnov> disnovs;
}

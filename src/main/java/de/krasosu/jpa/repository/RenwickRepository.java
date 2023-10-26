package de.krasosu.jpa.repository;

import de.krasosu.jpa.model.Renwick;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RenwickRepository extends JpaRepository<Renwick, Long> {
}

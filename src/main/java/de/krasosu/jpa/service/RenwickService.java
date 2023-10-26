package de.krasosu.jpa.service;

import de.krasosu.jpa.model.Renwick;
import de.krasosu.jpa.repository.RenwickRepository;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class RenwickService {
    @Autowired
    private RenwickRepository renwickRepository;

    public Renwick saveRenwick(Renwick renwick) {
        return renwickRepository.save(renwick);
    }
}

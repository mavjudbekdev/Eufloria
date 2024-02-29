package com.example.eufloria.repository;

import com.example.eufloria.modul.Card;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface CardRepository extends GenericRepository<Card, UUID> {
    boolean existsByNumber(String number);
}

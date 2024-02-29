package com.example.eufloria.repository;

import com.example.eufloria.modul.Plant;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface PlantRepository extends GenericRepository<Plant, UUID> {
}

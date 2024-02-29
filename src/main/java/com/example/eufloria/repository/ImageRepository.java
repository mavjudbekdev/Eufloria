package com.example.eufloria.repository;

import com.example.eufloria.modul.Image;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface ImageRepository extends GenericRepository<Image, UUID> {
}

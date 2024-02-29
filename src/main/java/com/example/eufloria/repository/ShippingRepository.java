package com.example.eufloria.repository;

import com.example.eufloria.modul.Shipping;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface ShippingRepository extends GenericRepository<Shipping, UUID> {
}

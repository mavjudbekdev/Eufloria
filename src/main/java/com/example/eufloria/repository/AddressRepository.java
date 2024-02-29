package com.example.eufloria.repository;

import com.example.eufloria.modul.Address;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface AddressRepository extends GenericRepository<Address, UUID> {
}

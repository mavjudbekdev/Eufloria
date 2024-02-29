package com.example.eufloria.repository;

import com.example.eufloria.modul.Role;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface RoleRepository extends GenericRepository<Role, UUID> {
}

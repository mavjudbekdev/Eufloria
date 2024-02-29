package com.example.eufloria.repository;

import com.example.eufloria.modul.User;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface UserRepository extends GenericRepository<User, UUID> {
}

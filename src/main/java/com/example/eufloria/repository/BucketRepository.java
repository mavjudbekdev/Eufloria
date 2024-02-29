package com.example.eufloria.repository;

import com.example.eufloria.modul.Bucket;
import com.example.eufloria.modul.User;
import org.springframework.stereotype.Repository;


import java.util.Optional;
import java.util.UUID;

@Repository
public interface BucketRepository extends GenericRepository<Bucket, UUID> {
    Optional<Bucket> findByUser(User user);
}

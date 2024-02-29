package com.example.eufloria.repository;

import com.example.eufloria.modul.Bucket;
import com.example.eufloria.modul.BucketItem;
import com.example.eufloria.modul.Plant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Optional;

@Repository
public interface BucketItemRepository extends JpaRepository<BucketItem, BucketItem.BucketId> {
    Optional<BucketItem> findByBucketAndPlant(Bucket bucket, Plant plant);
}

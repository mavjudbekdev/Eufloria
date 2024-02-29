package com.example.eufloria.repository;

import com.example.eufloria.modul.Payment;
import org.springframework.stereotype.Repository;


import java.util.UUID;

@Repository
public interface PaymentRepository extends GenericRepository<Payment, UUID> {
}

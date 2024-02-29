package com.example.eufloria.modul;

import com.example.eufloria.modul.template.AbsUUIDEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;


@Entity
public class Payment extends AbsUUIDEntity {
    @OneToOne
    private Order order;

    private boolean isPaid;

    @ManyToOne
    private Card card;
}

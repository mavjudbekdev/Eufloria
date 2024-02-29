package com.example.eufloria.modul;

import com.example.eufloria.modul.template.AbsUUIDEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@Entity(name = "orders")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order extends AbsUUIDEntity {
    @OneToOne
    private Bucket bucket;

    @ManyToOne
    private Shipping shipping;
}

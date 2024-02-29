package com.example.eufloria.modul;

import com.example.eufloria.modul.template.AbsUUIDEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Plant extends AbsUUIDEntity {
    @Column(nullable = false)
    private String name;
    private String description;
    private double price;
    private double discount;
    @OneToOne
    private Image image;
}

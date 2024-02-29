package com.example.eufloria.modul;

import com.example.eufloria.modul.template.AbsUUIDEntity;
import jakarta.persistence.*;
import lombok.*;


import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends AbsUUIDEntity {
    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Plant> favouritePlants;

    @ManyToMany
    private List<Card> cards;

    @ManyToMany
    private List<Address> addresses;

    @OneToOne
    @ToString.Exclude
    private Bucket bucket;

    // may change to enum
    @ManyToOne
    private Role role;
}

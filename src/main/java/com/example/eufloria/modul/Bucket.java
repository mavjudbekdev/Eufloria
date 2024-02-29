package com.example.eufloria.modul;

import com.example.eufloria.dto.bucket.BucketItemResDto;
import com.example.eufloria.dto.bucket.BucketResponseDto;
import com.example.eufloria.modul.template.AbsUUIDEntity;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bucket extends AbsUUIDEntity {
    @OneToOne
    private User user;

    @OneToMany(mappedBy = "bucket")
    private List<BucketItem> items = new ArrayList<>();

    public Bucket(User user) {
        this.id = UUID.randomUUID();
        this.user = user;
    }

    public void addItem(Plant plant, int amount) {
        items.add(new BucketItem(plant, this, amount));
    }

    public BucketResponseDto toResponseDto() {
        return new BucketResponseDto(this.items.stream()
                .map(
                        (bItem) -> new BucketItemResDto(
                                bItem.getPlant(), bItem.getAmount()
                        ))
                .collect(Collectors.toList()));
    }
}

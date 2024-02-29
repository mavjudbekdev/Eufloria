package com.example.eufloria.dto.bucket;

import com.example.eufloria.modul.Plant;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class BucketItemResDto {
    private Plant plant;
    private int amount;
}

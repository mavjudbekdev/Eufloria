package com.example.eufloria.mapper;

import com.example.eufloria.dto.ShippingDto;
import com.example.eufloria.modul.Shipping;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


import java.util.UUID;

@Component
@RequiredArgsConstructor
public class ShippingMapper extends GenericMapper<Shipping, ShippingDto, Shipping, ShippingDto> {
    private final ModelMapper mapper;

    @Override
    public Shipping toEntity(ShippingDto shippingDto) {
        Shipping shipping = mapper.map(shippingDto, Shipping.class);
        shipping.setId(UUID.randomUUID());
        return shipping;
    }

    @Override
    public Shipping toResponseDto(Shipping enShipping) {
        return enShipping;
    }

    @Override
    public void toEntity(ShippingDto shippingDto, Shipping enShipping) {
        mapper.map(shippingDto, enShipping);
    }
}

package com.example.eufloria.mapper;

import com.example.eufloria.dto.plant.PlantCreateDto;
import com.example.eufloria.dto.plant.PlantResponseDto;
import com.example.eufloria.dto.plant.PlantUpdateDto;
import com.example.eufloria.modul.Plant;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;


@Component
@RequiredArgsConstructor
public class PlantDtoMapper extends GenericMapper<Plant, PlantCreateDto, PlantResponseDto, PlantUpdateDto> {
    private final ModelMapper modelMapper;
    @Override
    public Plant toEntity(PlantCreateDto plantCreateDto) {
        return modelMapper.map(plantCreateDto,Plant.class);
    }

    @Override
    public PlantResponseDto toResponseDto(Plant plant) {
        return modelMapper.map(plant, PlantResponseDto.class);
    }

    @Override
    public void toEntity(PlantUpdateDto plantUpdateDto, Plant plant) {
    modelMapper.map(plantUpdateDto,plant);
    }
}

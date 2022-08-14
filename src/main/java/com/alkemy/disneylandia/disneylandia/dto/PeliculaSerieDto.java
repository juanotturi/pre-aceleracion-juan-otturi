package com.alkemy.disneylandia.disneylandia.dto;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class PeliculaSerieDto {
    private Long id;
    private String titulo;
    private String imagen;
    private LocalDate fechaCreacion;
    private int calificacion;
    private List<PersonajeDto> personajes;
}
package com.noemi.videogame.Entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Videojuego {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(max = 50)
    @Column(nullable = false, length = 50)
    private String titulo;

    @Enumerated(EnumType.STRING)
    @Column(length = 20)
    private Genero gen;

    @Column(precision = 10, scale = 2)
    private BigDecimal precio;

    @Column(nullable = false, length = 50)
    private Integer Udsvend;

    @Column(nullable = false)
    private LocalDate fechaLanzamiento;

    @Column(nullable = false)
    private Boolean disponible = true;

    @JoinColumn(name = "desarrolladorid", nullable = false)
    @ManyToOne
    private Desarrollador desarrolladorid;

}



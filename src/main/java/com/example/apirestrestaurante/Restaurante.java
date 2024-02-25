package com.example.apirestrestaurante;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "restaurantes")
public class Restaurante {
    /**
     * Id del restaurante.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Nombre del restaurante.
     */
    private String nombre;

    /**
     * Calificación del restaurante (1 a 5 estrellas).
     */
    private Integer estrellas;

    /**
     * Lugar del restaurante.
     */
    private String lugar;

    /**
     * Tipo de gastronomia que ofrece el restaurante.
     */
    private String gastronomia;

    /**
     * Obrece si tiene un menú del día o no.
     */
    private Boolean menu;

    /**
     * Obrece menuInfantil o no.
     */
    private Boolean menuinfantil;

    /**
     * Precio del restaurante.
     */
    private Double precio;
}
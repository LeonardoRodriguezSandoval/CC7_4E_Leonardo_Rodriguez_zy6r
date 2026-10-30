package com.utez.edu.mx.zy6r_4E_Leonardo_Rodriguez_CC7.model.prestamo;

import com.utez.edu.mx.zy6r_4E_Leonardo_Rodriguez_CC7.model.videojuego.Videojuego;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nombreSolicitante;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private String estado;
    @ManyToOne
    @JoinColumn(name = "otro-videojuego")
    private Videojuego videojuego;


    public void setFechaDevolucion() {
        setFechaDevolucion();
    }
}

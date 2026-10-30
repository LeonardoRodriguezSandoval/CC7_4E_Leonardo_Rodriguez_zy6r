package com.utez.edu.mx.zy6r_4E_Leonardo_Rodriguez_CC7.service;

import com.utez.edu.mx.zy6r_4E_Leonardo_Rodriguez_CC7.model.prestamo.Prestamo;
import com.utez.edu.mx.zy6r_4E_Leonardo_Rodriguez_CC7.model.videojuego.Videojuego;
import org.springframework.stereotype.Service;

@Service
public class RegistrarDevolucion {

    public String registrarDevolucion(Videojuego videojuego, Prestamo prestamo){
        int id = Math.toIntExact(videojuego.getId());

        if (prestamo.getEstado() == "ACTIVO"){
            prestamo.setEstado("DEVUELTO");
            prestamo.setFechaDevolucion("1");
            videojuego.setDisponible(true);
        } else {
            return "Error";
        }
        return null;
    }

}

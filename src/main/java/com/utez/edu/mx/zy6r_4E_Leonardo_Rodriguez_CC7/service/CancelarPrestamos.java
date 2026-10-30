package com.utez.edu.mx.zy6r_4E_Leonardo_Rodriguez_CC7.service;

import com.utez.edu.mx.zy6r_4E_Leonardo_Rodriguez_CC7.model.prestamo.Prestamo;
import com.utez.edu.mx.zy6r_4E_Leonardo_Rodriguez_CC7.model.videojuego.Videojuego;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
@RequestMapping("/model/videojuego")
public class CancelarPrestamos {

    public void validarJuego(Videojuego videojuego, Prestamo prestamo){
        if (videojuego.isDisponible()){
            prestamo.setEstado("CANCELADO");
        }
    }

}

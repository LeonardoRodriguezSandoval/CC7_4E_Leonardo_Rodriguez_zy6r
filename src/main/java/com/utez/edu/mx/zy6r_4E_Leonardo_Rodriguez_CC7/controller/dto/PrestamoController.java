package com.utez.edu.mx.zy6r_4E_Leonardo_Rodriguez_CC7.controller.dto;

import com.utez.edu.mx.zy6r_4E_Leonardo_Rodriguez_CC7.service.RegistrarVideojuego;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
@CrossOrigin("*")
public class PrestamoController {

    private final RegistrarVideojuego registrarVideojuego;

    public PrestamoController(RegistrarVideojuego registrarVideojuego){
        this.registrarVideojuego = registrarVideojuego;
    }

}

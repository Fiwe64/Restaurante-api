package com.Reserva.Restaurante.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {
    @GetMapping
    public String olaMundo(){
        return "Olá mundo eu estou FUNCIONANDO!!!!!!!!!!!!!!! ^-^";
    }
}

package com.itsqmet.AppControladores.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PaginaController {

    @GetMapping("/") // http://localhost:8080/
    public String home(){
        return "home"; //documento HTML
    }

    @GetMapping("/contactos") // http://localhost:8080/contactos
    public String contactos(){
        return "contactos"; // documento HTML
    }

}

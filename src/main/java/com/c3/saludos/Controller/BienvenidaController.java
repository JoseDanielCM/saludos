package com.c3.saludos.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@Controller
public class BienvenidaController {

    @GetMapping("/bienvenida")
    public String bienvenida(Model model) {
        LocalDate fechaActual = LocalDate.now();
        model.addAttribute("fecha", fechaActual);
        return "bienvenida";
    }

}

package com.pruebasjohn.pruebasjohn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//permite inyectar directamente en el html
@RestController
public class indexRest {

    @GetMapping ("/hola")
    public String index() {
        return "Inicio";
    }

}

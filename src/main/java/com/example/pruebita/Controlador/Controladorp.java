
package com.example.pruebita.Controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/datos")
public class Controladorp {
    
    @GetMapping("/pruebalocal")
    public String mostrar(){
        return"hola mundo";
    }
    
}

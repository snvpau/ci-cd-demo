package com.example.spring_boot_app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //clase rest 
public class HelloController {

    @GetMapping("/hello") //mapea solicitudes get en el end point "/hello"
    public String sayHello() {
        return "Hello World!"; //regresa un mensaje simple que dice hello world! cuando accede al endpoint
    }
}

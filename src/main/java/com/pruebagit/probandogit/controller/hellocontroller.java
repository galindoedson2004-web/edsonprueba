
package com.pruebagit.probandogit.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class hellocontroller {
@GetMapping("/")
public String saludo() {
return "Hola desde Spring Boot + Jenkins CI";
}
}
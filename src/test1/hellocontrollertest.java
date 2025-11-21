package com.pruebagit.probandogit.controller;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class hellocontrollertest {
    
@Test
void testSaludo() {
hellocontroller controller = new hellocontroller();
assertEquals("Hola desde Spring Boot + Jenkins CI", controller.
saludo());
}
}
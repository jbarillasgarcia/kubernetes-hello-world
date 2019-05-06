package gt.edu.umg.ingenieria.sistemas.so2.hellokubernetes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DefaultController {

    @GetMapping("/sayHello")
    public String sayHello() {
        return "Hola mundo!!!";
    }
    
}

package local.springframework.sfgdi.controllers;

import local.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

public class ConstructorInjectedController {
    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}

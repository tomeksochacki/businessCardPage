package pl.ts.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class SimpleController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String metoda1(){
        System.out.println("Działa metoda2 !!");
        return "main";
    }

    @RequestMapping(value = "/adres1", method = RequestMethod.GET)
    public String metoda2(){
        System.out.println("Udało się mamy żądanie HTTP !!!");
        return "contact";
    }

    @RequestMapping(value = "/adres2", method = RequestMethod.GET)
    public String metoda3(){
        System.out.println("Udało się mamy żadanie HTTP nr3 !!!");
        return "gallery";
    }
}

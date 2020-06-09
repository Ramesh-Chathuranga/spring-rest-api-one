package lk.dll.java.rest.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "")
@CrossOrigin
public class ControllerTwo {

    @GetMapping
    public String Hello(){
        System.out.println("llllll");
        return "controllerOne";
    }
}

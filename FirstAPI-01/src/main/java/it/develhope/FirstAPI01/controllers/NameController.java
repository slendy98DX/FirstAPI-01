package it.develhope.FirstAPI01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameController {

    @GetMapping("/name")
    public String getName(@RequestParam String name){
        return name;
    }

    @PostMapping("/name")
    public StringBuilder postReverseName(@RequestParam String name){
        StringBuilder sb = new StringBuilder(name);
        return sb.reverse();
    }
}

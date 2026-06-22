package br.com.costa.spring_boot.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/teste")
public class Teste {

    @GetMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public String get1(@PathVariable("id") String id) {
        return "Olá " + id;
    }

    @GetMapping(value = "/")
    @ResponseStatus(HttpStatus.OK)
    public String get2(@RequestParam(value = "name", required = false) String name) {
        return "Olá " + name;
    }

}

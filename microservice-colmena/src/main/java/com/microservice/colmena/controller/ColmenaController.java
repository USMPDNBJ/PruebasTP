package com.microservice.colmena.controller;

import com.microservice.colmena.entities.Colmena;
import com.microservice.colmena.service.IColmenaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/colmena")
public class ColmenaController {

    @Autowired
    private IColmenaService colmenaService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveColmena(@RequestBody Colmena colmena){
        colmenaService.save(colmena);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllColmena(){
        return ResponseEntity.ok(colmenaService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        return ResponseEntity.ok(colmenaService.findById(id));
    }

}

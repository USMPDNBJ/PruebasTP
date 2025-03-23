package com.microservice.authority.controller;

import com.microservice.authority.entities.Authority;
import com.microservice.authority.service.IAuthorityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/authority")
public class AuthorityController {

    @Autowired(required = true)
    private IAuthorityService authorityService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveAuthority(@RequestBody Authority authority){
        authorityService.save(authority);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllAuthority(){
        return ResponseEntity.ok(authorityService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        return ResponseEntity.ok(authorityService.findById(id));
    }
    @GetMapping("/search-by-usuario/{idUsuario}")
    public ResponseEntity<?> findByIdAuthority(@PathVariable Integer idUsuario){
        return ResponseEntity.ok(authorityService.findByIdUsuario(idUsuario));
    }
}

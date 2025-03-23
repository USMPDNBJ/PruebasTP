package com.microservice.usuario.controller;

import com.microservice.usuario.entities.Usuario;
import com.microservice.usuario.service.IUsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuario")
public class UsuarioController {

    @Autowired
    private IUsuarioService usuarioService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public void saveStudent(@RequestBody Usuario usuario){
        usuarioService.save(usuario);
    }

    @GetMapping("/all")
    public ResponseEntity<?> findAllAuthority(){
        return ResponseEntity.ok(usuarioService.findAll());
    }

    @GetMapping("/search/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        return ResponseEntity.ok(usuarioService.findById(id));
    }

    @GetMapping("/search-authority/{idUsuario}")
    public ResponseEntity<?> findStudentByIdCourse(@PathVariable Integer idUsuario){
        return ResponseEntity.ok(usuarioService.findAuthorityByIdUsuario(idUsuario));
    }

}

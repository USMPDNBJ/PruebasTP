package com.microservice.usuario.service;


import com.microservice.usuario.entities.Usuario;
import com.microservice.usuario.http.response.AuthorityByUsuarioResponse;

import java.util.List;

public interface IUsuarioService {

    List<Usuario> findAll();

    Usuario findById(Integer id);

    void save(Usuario usuario);

    AuthorityByUsuarioResponse findAuthorityByIdUsuario(Integer idUsuario);
}

package com.microservice.authority.service;

import com.microservice.authority.entities.Authority;

import java.util.List;

public interface IAuthorityService {

    List<Authority> findAll();

    Authority findById(Integer id);

    void save(Authority authority);

    List<Authority> findByIdUsuario(Integer idUsuario);
}

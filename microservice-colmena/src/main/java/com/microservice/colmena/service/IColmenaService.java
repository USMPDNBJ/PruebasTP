package com.microservice.colmena.service;


import com.microservice.colmena.entities.Colmena;

import java.util.List;

public interface IColmenaService {

    List<Colmena> findAll();

    Colmena findById(Integer id);

    void save(Colmena colmena);

}

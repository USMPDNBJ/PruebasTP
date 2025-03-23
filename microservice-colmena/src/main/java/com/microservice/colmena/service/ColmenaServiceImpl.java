package com.microservice.colmena.service;

import com.microservice.colmena.entities.Colmena;
import com.microservice.colmena.persistence.ColmenaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColmenaServiceImpl implements IColmenaService {

    @Autowired
    private ColmenaRepository colmenaRepository;

    @Override
    public List<Colmena> findAll() {
        return (List<Colmena>) colmenaRepository.findAll();
    }

    @Override
    public Colmena findById(Integer id) {
        return colmenaRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Colmena colmena) {
        colmenaRepository.save(colmena);
    }


}

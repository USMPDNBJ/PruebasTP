package com.microservice.authority.service;

import com.microservice.authority.entities.Authority;
import com.microservice.authority.persistence.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorityServiceImpl implements IAuthorityService {

    @Autowired
    private AuthorityRepository authorityRepository;

    @Override
    public List<Authority> findAll() {
        return (List<Authority>) authorityRepository.findAll();
    }

    @Override
    public Authority findById(Integer id) {
        return authorityRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Authority authority) {
        authorityRepository.save(authority);
    }

    @Override
    public List<Authority> findByIdUsuario(Integer idUsuario) {
        return authorityRepository.findAllByUsuId(idUsuario);
    }
}

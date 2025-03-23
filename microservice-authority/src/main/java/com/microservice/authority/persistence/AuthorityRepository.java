package com.microservice.authority.persistence;

import com.microservice.authority.entities.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, Integer> {


    List<Authority> findAllByUsuId(Integer idUsuario);


}

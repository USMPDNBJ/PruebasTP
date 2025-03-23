package com.microservice.colmena.persistence;

import com.microservice.colmena.entities.Colmena;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface ColmenaRepository extends JpaRepository<Colmena, Integer> {

}

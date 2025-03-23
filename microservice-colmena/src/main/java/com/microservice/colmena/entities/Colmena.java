package com.microservice.colmena.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Builder
@Table(name ="t_colmena")
@NoArgsConstructor
@AllArgsConstructor
public class Colmena {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String humedad;
    private String temperatura;
    private String vascula;
    private String gps;
    @Column(name = "fecha_registro")
    private Date fecRegistro;
    private boolean activo;
}

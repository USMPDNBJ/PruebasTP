package com.microservice.usuario.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@Builder
@Table(name ="t_usuario")
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @Column(name = "apellido_paterno")
    private String apePaterno;
    @Column(name = "apellido_materno")
    private String apeMaterno;
    @Column(name = "fecha_nacimiento")
    private Date fecNacimiento;
    private String dni;
    private String genero;
    private String correo;
    @Column(name = "fecha_registro")
    private Date fecRegistro;
    private boolean activo;
}

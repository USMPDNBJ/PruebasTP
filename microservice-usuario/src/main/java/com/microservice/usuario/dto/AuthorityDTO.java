package com.microservice.usuario.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthorityDTO {

    private Integer id;
    private String username;
    private String contrasena;
    private Date fechaRegistro;
    private String rol;
    private Integer usuId;
}

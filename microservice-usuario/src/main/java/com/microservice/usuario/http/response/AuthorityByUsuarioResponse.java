package com.microservice.usuario.http.response;

import com.microservice.usuario.dto.AuthorityDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorityByUsuarioResponse {

    private String nombre;
    private String correo;
    private List<AuthorityDTO> authorityDTOList;

}

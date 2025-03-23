package com.microservice.usuario.service;

import com.microservice.usuario.dto.AuthorityDTO;
import com.microservice.usuario.entities.Usuario;
import com.microservice.usuario.client.AuthorityClient;
import com.microservice.usuario.http.response.AuthorityByUsuarioResponse;
import com.microservice.usuario.persistence.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private AuthorityClient authorityClient;

    @Override
    public List<Usuario> findAll() {
        return (List<Usuario>) usuarioRepository.findAll();
    }

    @Override
    public Usuario findById(Integer id) {
        return usuarioRepository.findById(id).orElseThrow();
    }

    @Override
    public void save(Usuario usuario) {
        usuarioRepository.save(usuario);
    }


   @Override
    public AuthorityByUsuarioResponse findAuthorityByIdUsuario(Integer idUsuario) {
        Usuario usuario = usuarioRepository.findById(idUsuario).orElse(new Usuario());
        List<AuthorityDTO> authorityDTOList = authorityClient.findAllAuthorityByUsuario(idUsuario);
        return AuthorityByUsuarioResponse.builder()
                .nombre(usuario.getNombre())
                .correo(usuario.getCorreo())
                .authorityDTOList(authorityDTOList)
                .build();
    }


}

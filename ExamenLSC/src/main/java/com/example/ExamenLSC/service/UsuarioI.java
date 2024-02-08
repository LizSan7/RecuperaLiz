package com.example.ExamenLSC.service;

import com.example.ExamenLSC.model.dto.UsuarioDto;
import com.example.ExamenLSC.model.entity.UsuarioBean;

import java.util.List;

public interface UsuarioI {
    UsuarioBean save (UsuarioDto usuarioDto, boolean estado);
    void delete (UsuarioBean usuarioBean);
    UsuarioBean findById(Integer id);
    List<UsuarioBean> findAll();

}

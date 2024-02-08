package com.example.ExamenLSC.service.Impl;

import com.example.ExamenLSC.model.dao.UsuarioDao;
import com.example.ExamenLSC.model.dto.UsuarioDto;
import com.example.ExamenLSC.model.entity.UsuarioBean;
import com.example.ExamenLSC.service.UsuarioI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class UsuarioImpl implements UsuarioI {

    @Autowired
    UsuarioDao usuarioDao;
    @Override
    public UsuarioBean save(UsuarioDto usuarioDto, boolean estado) {
        String contrasenia = generarContrasenia();
            UsuarioBean usuarioBean = UsuarioBean.builder()
                    .id_usuario(usuarioDto.getId_usuario())
                    .nombre_usuario(usuarioDto.getNombre_usuario())
                    .estado(true)
                    .contrasenia(contrasenia)
                    .build();
        return usuarioDao.save(usuarioBean);
    }

    @Override
    public void delete(UsuarioBean usuarioBean) {
        usuarioDao.delete(usuarioBean); ;
    }

    @Override
    public UsuarioBean findById(Integer id) {
        return usuarioDao.findById(id).orElse(null);
    }

    @Override
    public List<UsuarioBean> findAll() {
        return (List<UsuarioBean>) usuarioDao.findAll();
    }

    public String generarContrasenia(){
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()_+=-";
        StringBuilder contrasenia = new StringBuilder();
        Random random = new Random();
        int longitud = 8;

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(caracteres.length());
            contrasenia.append(caracteres.charAt(index));
        }

        return contrasenia.toString();
    }
}



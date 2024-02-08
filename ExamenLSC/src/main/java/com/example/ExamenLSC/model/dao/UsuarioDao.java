package com.example.ExamenLSC.model.dao;

import com.example.ExamenLSC.model.entity.UsuarioBean;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioDao extends CrudRepository<UsuarioBean, Integer> {
}

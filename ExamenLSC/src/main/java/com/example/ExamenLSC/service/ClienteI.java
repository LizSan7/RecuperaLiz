package com.example.ExamenLSC.service;

import com.example.ExamenLSC.model.dto.ClienteDto;
import com.example.ExamenLSC.model.entity.ClienteBean;

import java.util.List;

public interface ClienteI {
    ClienteBean save (ClienteDto personDto );
    void delete (ClienteBean personBean);
    ClienteBean findById(Integer id);
    List<ClienteBean> findAll();

}

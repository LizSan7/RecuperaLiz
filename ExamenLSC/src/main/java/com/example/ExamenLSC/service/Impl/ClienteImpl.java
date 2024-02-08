package com.example.ExamenLSC.service.Impl;

import com.example.ExamenLSC.model.dao.ClienteDao;
import com.example.ExamenLSC.model.dto.ClienteDto;
import com.example.ExamenLSC.model.entity.ClienteBean;
import com.example.ExamenLSC.service.ClienteI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class ClienteImpl implements ClienteI {
    @Autowired
    ClienteDao personDao;

    @Override
    public ClienteBean save(ClienteDto personDto) {
        ClienteBean personBean = ClienteBean.builder()
                .id_persona(personDto.getId_persona())
                .nombre(personDto.getNombre())
                .primer_apellido(personDto.getPrimer_apellido())
                .segundo_apellido(personDto.getSegundo_apellido())
                .fecha_nacimiento(personDto.getFecha_nacimiento())
                .direccion(personDto.getDireccion())
                .contacto(personDto.getContacto())
                .build();
        return personDao.save(personBean);
    }

    @Override
    public void delete(ClienteBean personBean) {
        personDao.delete(personBean);
    }

    @Override
    public ClienteBean findById(Integer id) {
        return personDao.findById(id).orElse(null);
    }

    @Override
    public List<ClienteBean> findAll() {
        return (List<ClienteBean>) personDao.findAll();
    }

}
package com.example.ExamenLSC.controller;

import com.example.ExamenLSC.model.dto.ClienteDto;
import com.example.ExamenLSC.model.entity.ClienteBean;
import com.example.ExamenLSC.service.ClienteI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cliente")
public class ClienteController {
    @Autowired
    ClienteI personaService;

    @GetMapping("/")
    public List<ClienteBean> getAll(){
        return personaService.findAll();
    }

    @GetMapping("/{id}")
    public ClienteBean showById(@PathVariable Integer id){
        return personaService.findById(id);
    }


    @PostMapping("/")
    public ClienteDto create(@RequestBody ClienteDto personaDto) {
        ClienteBean personaSave = personaService.save(personaDto);
        return ClienteDto.builder()
                .id_persona(personaSave.getId_persona())
                .primer_apellido(personaSave.getPrimer_apellido())
                .segundo_apellido(personaSave.getSegundo_apellido())
                .nombre(personaSave.getNombre())
                .fecha_nacimiento(personaSave.getFecha_nacimiento())
                .direccion(personaSave.getDireccion())
                .contacto(personaSave.getContacto())
                .build();

    }

    @PutMapping("/{id}")
    public ClienteDto update(@RequestBody ClienteDto personaDto) {
        ClienteBean personaUpdate = personaService.save(personaDto);
        return ClienteDto.builder()
                .id_persona(personaUpdate.getId_persona())
                .primer_apellido(personaUpdate.getPrimer_apellido())
                .segundo_apellido(personaUpdate.getSegundo_apellido())
                .nombre(personaUpdate.getNombre())
                .fecha_nacimiento(personaUpdate.getFecha_nacimiento())
                .direccion(personaUpdate.getDireccion())
                .contacto(personaUpdate.getContacto())
                .build();
    }
    @DeleteMapping("/{id}")
    public void delete (@PathVariable Integer id){
        ClienteBean persona = personaService.findById(id);
        personaService.delete(persona);
    }
}

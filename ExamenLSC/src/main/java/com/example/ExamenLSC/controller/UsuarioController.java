package com.example.ExamenLSC.controller;

import com.example.ExamenLSC.model.dto.UsuarioDto;
import com.example.ExamenLSC.model.entity.UsuarioBean;
import com.example.ExamenLSC.service.UsuarioI;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/usuario")
public class UsuarioController {
    @Autowired
    UsuarioI usuarioService;

    @GetMapping("/")
    public List<UsuarioBean> getAll() {
        return usuarioService.findAll();
    }

    @GetMapping("/{id}")
    public UsuarioBean showById(@PathVariable Integer id) {
        return usuarioService.findById(id);
    }

    @PostMapping("/")
    public UsuarioDto create(@RequestBody UsuarioDto usuarioDto) {
        boolean estado = usuarioDto.isEstado();


        UsuarioBean usuarioSave = usuarioService.save(usuarioDto, estado);
        return UsuarioDto.builder()
                .id_usuario(usuarioSave.getId_usuario())
                .nombre_usuario(usuarioSave.getNombre_usuario())
                .contrasenia(usuarioSave.getContrasenia())
                .estado(usuarioSave.isEstado())
                .build();

    }

    @PutMapping("/{id}")
    public UsuarioDto update(@RequestBody UsuarioDto usuarioDto) {
        boolean estado = usuarioDto.isEstado();
        UsuarioBean usuarioUpdate = usuarioService.save(usuarioDto, estado);
        return UsuarioDto.builder()
                .id_usuario(usuarioUpdate.getId_usuario())
                .nombre_usuario(usuarioUpdate.getNombre_usuario())
                .contrasenia(usuarioUpdate.getContrasenia())
                .estado(usuarioUpdate.isEstado())
                .build();
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id){
        UsuarioBean usuario = usuarioService.findById(id);
        usuarioService.delete(usuario);
    }
}

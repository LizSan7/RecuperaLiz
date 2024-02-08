package com.example.ExamenLSC.model.entity;

import jakarta.persistence.*;
import lombok.*;

@Builder
@ToString
@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name = "usuarios")

public class UsuarioBean {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Integer id_usuario;
    @Column(name = "nombre_usuario")
    private String nombre_usuario;
    @Column(name= "contrasenia")
    private String contrasenia;
    @Column(name = "estado")
    private boolean estado;

    public UsuarioBean() {
        this.estado = true;
    }

}

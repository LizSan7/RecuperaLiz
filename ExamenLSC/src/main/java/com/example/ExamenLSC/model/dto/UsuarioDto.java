package com.example.ExamenLSC.model.dto;

import jakarta.persistence.Column;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class UsuarioDto {
    private Integer id_usuario;
    private String nombre_usuario;
    private String contrasenia;
    private boolean estado;

}

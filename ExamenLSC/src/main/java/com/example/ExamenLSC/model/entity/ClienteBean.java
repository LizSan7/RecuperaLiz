package com.example.ExamenLSC.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Builder
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "clientes")

public class ClienteBean {
    @Id
    @Column(name = "id_persona", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_persona;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    @Column(name = "primer_apellido", nullable = false)
    private String primer_apellido;
    @Column(name = "segundo_apellido", nullable = false)
    private String segundo_apellido;
    @Column(name = "fecha_nacimiento", nullable = false)
    private LocalDate fecha_nacimiento;
    @Column(name = "direccion", nullable = false)
    private String direccion;
    @Column(name = "contacto", nullable = false)
    private String contacto;

}

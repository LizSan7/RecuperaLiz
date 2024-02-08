    package com.example.ExamenLSC.model.dto;

    import lombok.*;

    import java.time.LocalDate;

    @Data
    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @ToString
    @Builder
    public class ClienteDto {
        private Integer id_persona;
        private String nombre;
        private String primer_apellido;
        private String segundo_apellido;
        private LocalDate fecha_nacimiento;
        private String direccion;
        private String contacto;
    }

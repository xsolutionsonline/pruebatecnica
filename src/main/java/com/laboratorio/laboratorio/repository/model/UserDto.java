package com.laboratorio.laboratorio.repository.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.OneToOne;

@NoArgsConstructor
@Data
public class UserDto {
    private String dni;
    private String name;
    private String lastname;
    private String email;
    private String phone;
    private DiagnosticDto diagnostic;
}

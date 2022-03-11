package com.laboratorio.laboratorio.repository.model;

import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name="user")
@Data
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer dni;

    @Column
    private String name;

    @Column(name="last_name")
    private String lastname;

    @Column
    private String email;

    @Column
    private String phone;

    @OneToOne(cascade =CascadeType.ALL, orphanRemoval=true)
    private DiagnosticEntity diagnostic;








}

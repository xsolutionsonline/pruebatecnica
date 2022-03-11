package com.laboratorio.laboratorio.repository.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="diagnostic")
@Data
public class DiagnosticEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    @Column(name="sugar_percentage")
    Long sugarPercentage;

    @Column(name="fat_percentage")
    Long fatPercentage;

    @Column(name="oxygen_percentage")
    Long oxygenPercentage;

    @Column
    String risk;


}

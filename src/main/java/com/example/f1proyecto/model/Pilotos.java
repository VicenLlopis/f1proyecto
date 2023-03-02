package com.example.f1proyecto.model;

import jakarta.persistence.*;

@Entity
@Table
public class Pilotos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    @OneToOne(mappedBy = "ganador")
    private Carreras carreraGanada;
    @ManyToOne
    @JoinColumn(name = "Nombre_Escuderia")
    private Escuderia nombreEscuderia;

    public Pilotos() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Carreras getCarreraGanada() {
        return carreraGanada;
    }

    public void setCarreraGanada(Carreras carreraGanada) {
        this.carreraGanada = carreraGanada;
    }

    public Escuderia getNombreEscuderia() {
        return nombreEscuderia;
    }

    public void setNombreEscuderia(Escuderia nombreEscuderia) {
        this.nombreEscuderia = nombreEscuderia;
    }
}


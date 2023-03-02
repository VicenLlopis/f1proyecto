package com.example.f1proyecto.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Escuderia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    @OneToMany(mappedBy = "nombreEscuderia", cascade = CascadeType.ALL)
    private List<Pilotos> listaPilotos;

    private String ceo;

    public Escuderia() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Pilotos> getListaPilotos() {
        return listaPilotos;
    }

    public void setListaPilotos(List<Pilotos> listaPilotos) {
        this.listaPilotos = listaPilotos;
    }

    public String getCeo() {
        return ceo;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }
}

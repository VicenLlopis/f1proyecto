package com.example.f1proyecto.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table
public class Carreras {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String ciudad;
    @OneToMany(mappedBy = "carrera")
    private List<Comisario> listaComisario;

    @OneToOne
    @JoinColumn(name = "Ganador_Piloto")
    private Pilotos ganador;

    public Carreras() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public List<Comisario> getListaComisario() {
        return listaComisario;
    }

    public void setListaComisario(List<Comisario> listaComisario) {
        this.listaComisario = listaComisario;
    }

    public Pilotos getGanador() {
        return ganador;
    }

    public void setGanador(Pilotos ganador) {
        this.ganador = ganador;
    }
}

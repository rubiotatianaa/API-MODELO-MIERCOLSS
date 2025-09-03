package com.example.API.MODELO.MIERCOLSS.modelos;

import jakarta.persistence.*;

@Entity
@Table(name = "familiar")
public class Familiar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String parentesco;

    @Column(name = "telefono", nullable = false, unique = true)
    private Integer telefono;

    @Column(name = "direccion", nullable = false, unique = true)
    private String direccion;

    public Familiar() {
    }

    public Familiar(String parentesco, Integer telefono, String direccion) {
        this.parentesco = parentesco;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}

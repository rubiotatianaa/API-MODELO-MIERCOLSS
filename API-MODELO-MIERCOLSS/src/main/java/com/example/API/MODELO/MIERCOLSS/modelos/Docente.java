package com.example.API.MODELO.MIERCOLSS.modelos;


import com.example.API.MODELO.MIERCOLSS.ayudas.Departamento;
import jakarta.persistence.*;

@Entity
@Table(name = "docente")
public class Docente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "especialidad", nullable = false, unique = false)
    private String especialidad;
    @Column(name = "nivelacademico", nullable = false, unique = false)
    private Integer nivelAcademico;
    @Column(name = "departamento", nullable = false, unique = false)
    private Departamento departamento;

    public Docente() {
    }

    public Docente(Integer id, String especialidad, Integer nivelAcademico, Departamento departamento) {
        this.id = id;
        this.especialidad = especialidad;
        this.nivelAcademico = nivelAcademico;
        this.departamento = departamento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getNivelAcademico() {
        return nivelAcademico;
    }

    public void setNivelAcademico(Integer nivelAcademico) {
        this.nivelAcademico = nivelAcademico;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }
}

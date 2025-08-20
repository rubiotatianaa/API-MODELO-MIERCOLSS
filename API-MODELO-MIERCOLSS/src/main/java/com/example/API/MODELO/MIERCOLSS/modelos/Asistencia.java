package com.example.API.MODELO.MIERCOLSS.modelos;

import com.example.API.MODELO.MIERCOLSS.ayudas.Estado;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.sun.jdi.Value;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "asistencias")
public class Asistencia {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "fecha", nullable = false, unique = false)
    private LocalDate fecha;

    @Column(name = "estado", nullable = false, unique = false)
    @Enumerated(EnumType.STRING)
    private Estado estado;
    @Column(name = "observacion", nullable = true, unique = false)
    private String observacion;


    //CREANDO LA RELACIÓN DE MUCHOS A UNO
    //2. Como me relaciono con 1 solo elemento de la otra tabla creo una variable individual

    @ManyToOne
    //3. Construyo la relacion entre las tablas(defino la FK)
    @JoinColumn(name = "fk_estudiante", referencedColumnName = "id")
    @JsonManagedReference(value = "relacionentreestudianteyasistencia")
    private Estudiante estudiante;
    public Asistencia() {
    }

    public Asistencia(String observacion, Integer id, LocalDate fecha, Estado estado) {
        this.observacion = observacion;
        this.id = id;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }
}
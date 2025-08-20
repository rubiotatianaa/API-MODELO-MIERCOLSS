package com.example.API.MODELO.MIERCOLSS.modelos;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.ArrayList;

@Entity
@Table(name = "estudiantes")
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "promedio", nullable = false, unique = false, length = 3)
    private Double promedio;
    @Column(name = "fechanacimiento", nullable = false, unique = false)
    private LocalDate fechaNacimiento;

    @OneToOne
    //3. La tabla que tiene la FK configuro la relacion con la otra tabla
    @JoinColumn(name = "fk_usuario", referencedColumnName = "id")
    @JsonManagedReference(value = "relaciónusuarioyestudiante")
    private Usuario usuario;
    //CREANDO RELACIÓN DE 1 A MUCHOS
    //1. Para representar MUCHOS elemtos de otra tabla debo crear un arreglo(Lista)

    @OneToMany(mappedBy = "estudiante")
    @JsonBackReference(value = "relacionentreestudianteyasistencia")
    private ArrayList<Asistencia>asistencia;



    public Estudiante() {
    }


    public Estudiante(Integer id, Double promedio, LocalDate fechaNacimiento) {
        this.id = id;
        this.promedio = promedio;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
}

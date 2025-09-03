package com.example.API.MODELO.MIERCOLSS.modelos;

public class PerfilEstudiante {

    private Integer id;
    private String resumen;
    private String intereses;
    private String experiencias;
    private Integer proyectos;

    public PerfilEstudiante() {
    }

    public PerfilEstudiante(Integer id, String resumen, String intereses, String experiencias, Integer proyectos) {
        this.id = id;
        this.resumen = resumen;
        this.intereses = intereses;
        this.experiencias = experiencias;
        this.proyectos = proyectos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public String getIntereses() {
        return intereses;
    }

    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }

    public String getExperiencias() {
        return experiencias;
    }

    public void setExperiencias(String experiencias) {
        this.experiencias = experiencias;
    }

    public Integer getProyectos() {
        return proyectos;
    }

    public void setProyectos(Integer proyectos) {
        this.proyectos = proyectos;
    }
}

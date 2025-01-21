package com.alura.literalura.dto;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class AutorDTO {

    @JsonProperty("name")
    private String nombre;

    @JsonProperty("birth_year")
    private int anoDeNacimiento;

    @JsonProperty("death_year")
    private int anoDeFallecimiento;

    public int getAnoDeFallecimiento() {
        return anoDeFallecimiento;
    }

    public void setAnoDeFallecimiento(int anoDeFallecimiento) {
        this.anoDeFallecimiento = anoDeFallecimiento;
    }

    public int getAnoDeNacimiento() {
        return anoDeNacimiento;
    }

    public void setAnoDeNacimiento(int anoDeNacimiento) {
        this.anoDeNacimiento = anoDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

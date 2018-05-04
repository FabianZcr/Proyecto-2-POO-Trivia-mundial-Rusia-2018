/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Fabián
 */
public abstract class Pregunta {
    public String pregunta;
    public String tipo;
    public int nivelDificultad;
    public Categoria categoria;

    public Pregunta(String pregunta, String tipo, int nivelDificultad, Categoria categoria) {
        this.pregunta = pregunta;
        this.tipo = tipo;
        this.nivelDificultad = nivelDificultad;
        this.categoria = categoria;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }
    
    public abstract void obtenerRespuesta();


}

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
public class PreguntaVerdaderoFalso extends Pregunta{
    public Respuesta respuesta1;
    public Respuesta respuesta2;

    public PreguntaVerdaderoFalso(Respuesta respuesta1, Respuesta respuesta2, String pregunta, String tipo, int nivelDificultad, Categoria categoria) {
        super(pregunta, tipo, nivelDificultad, categoria);
        this.respuesta1 = respuesta1;
        this.respuesta2 = respuesta2;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Respuesta getRespuesta1() {
        return respuesta1;
    }

    public void setRespuesta1(Respuesta respuesta1) {
        this.respuesta1 = respuesta1;
    }

    public Respuesta getRespuesta2() {
        return respuesta2;
    }

    public void setRespuesta2(Respuesta respuesta2) {
        this.respuesta2 = respuesta2;
    }

    @Override
    public String getPregunta() {
        return pregunta;
    }

    @Override
    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public int getNivelDificultad() {
        return nivelDificultad;
    }

    @Override
    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }
    
    @Override
    public void obtenerRespuesta(){
        
    }
}

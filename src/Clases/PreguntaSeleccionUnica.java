/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author Fabián
 */
public class PreguntaSeleccionUnica extends Pregunta{
    public ArrayList<Respuesta> respuestas;

    public PreguntaSeleccionUnica(ArrayList<Respuesta> respuestas, String pregunta, String tipo, int nivelDificultad, Categoria categoria) {
        super(pregunta, tipo, nivelDificultad, categoria);
        this.respuestas = respuestas;   
    }

    public ArrayList<Respuesta> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(ArrayList<Respuesta> respuestas) {
        this.respuestas = respuestas;
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
   
    public void activarComodin() {
        int respuestasIncorrectas = 0;
        int i = 0;
        while (respuestasIncorrectas < 2 && i < respuestas.size()) {
            if (respuestas.get(i).isCorrecto() == false) {
                respuestas.remove(i);
                respuestasIncorrectas++;
                i++;
            }
            i++;
        }
    }
}

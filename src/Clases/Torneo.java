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
public class Torneo {
    public String nombreTorneo;
    public int numeroParticipantes;
    public ArrayList<Usuario> listaJugadores;
    public int nivelDificultad;
    public int cantidadPreguntas;

    public Torneo(String nombreTorneo, int numeroParticipantes,ArrayList<Usuario> listaJugadores, int nivelDificultad, int cantidadPreguntas) {
        this.nombreTorneo = nombreTorneo;
        this.numeroParticipantes = numeroParticipantes;
        this.listaJugadores = listaJugadores;
        this.nivelDificultad = nivelDificultad;
        this.cantidadPreguntas = cantidadPreguntas;
    }

    public String getNombreTorneo() {
        return nombreTorneo;
    }

    public void setNombreTorneo(String nombreTorneo) {
        this.nombreTorneo = nombreTorneo;
    }

    public int getNumeroParticipantes() {
        return numeroParticipantes;
    }

    public void setNumeroParticipantes(int numeroParticipantes) {
        this.numeroParticipantes = numeroParticipantes;
    }
    
    public ArrayList<Usuario> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Usuario> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public int getCantidadPreguntas() {
        return cantidadPreguntas;
    }

    public void setCantidadPreguntas(int cantidadPreguntas) {
        this.cantidadPreguntas = cantidadPreguntas;
    }
}

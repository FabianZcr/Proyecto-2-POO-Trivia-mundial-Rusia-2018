/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Fabián
 */
public class Usuario {
    private String nombreCompleto;
    private String nickname;
    private String email;
    private String contraseña;
    private String pais;
    private String sexo;
    public ImageIcon fotografia;
    public int monedas;

    public Usuario(String nombreCompleto, String nickname, String email, String contraseña, String pais, String sexo, ImageIcon fotografia) {
        this.nombreCompleto = nombreCompleto;
        this.nickname = nickname;
        this.email = email;
        this.contraseña = contraseña;
        this.pais = pais;
        this.sexo = sexo;
        this.fotografia = fotografia;
        this.monedas = 0;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public ImageIcon getFotografia() {
        return fotografia;
    }

    public void setFotografia(ImageIcon fotografia) {
        this.fotografia = fotografia;
    }

    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }
    
    
}

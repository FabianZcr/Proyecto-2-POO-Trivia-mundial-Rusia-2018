/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Image;

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
    private char sexo;
    public Image fotografia;

    public Usuario(String nombreCompleto, String nickname, String email, String contraseña, String pais, char sexo, Image fotografia) {
        this.nombreCompleto = nombreCompleto;
        this.nickname = nickname;
        this.email = email;
        this.contraseña = contraseña;
        this.pais = pais;
        this.sexo = sexo;
        this.fotografia = fotografia;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Image getFotografia() {
        return fotografia;
    }

    public void setFotografia(Image fotografia) {
        this.fotografia = fotografia;
    }
    
    
}

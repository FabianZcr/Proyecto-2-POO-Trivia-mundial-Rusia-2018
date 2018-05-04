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
public class Registros {
    public ArrayList<Usuario> listaUsuarios;   // lista para almacenar todos los usuarios de la aplicación;
    public static Registros instance = null;   // única instancia de la clase Registro (singleton)
    public Usuario usuarioActual = null;

    protected Registros(){
        this.listaUsuarios = new ArrayList<>();
    }

    public Usuario getUsuarioActual() {
        return usuarioActual;
    }

    public void setUsuarioActual(Usuario usuarioActual) {
        this.usuarioActual = usuarioActual;
    }
    
    
    
    // método para buscar un usuario en la lista de usuarios
    public Usuario buscarUsuario(String nickname){
        for(int i = 0; i < listaUsuarios.size(); i++){
            if(listaUsuarios.get(i).getNickname().equals(nickname))
                return listaUsuarios.get(i);
        }
        return null;
    }
    
   public static Registros getInstance(){
        if(instance == null)                             
            instance = new Registros();
        return instance;
    }
}

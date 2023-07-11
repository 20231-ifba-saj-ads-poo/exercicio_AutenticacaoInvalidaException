package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;

public class BancodeUsuarios {
    public static ArrayList<Usuario> Users = new ArrayList();
    public BancodeUsuarios(String login,String Senha){

    }

    private void autenticar(Usuario usuarioValidar){
        for (Usuario usuarioTeste : Users) {
            
        }
    }
    private static void addUsuario(Usuario novoUser){
        Users.add(novoUser);
    }
    
}

package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;

public class BancoDeUsuarios {
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

    public static void addUsuario(Usuario u){
        listaUsuarios.add(u);
    }

    public boolean autenticar(String login, String senha){
        for (int i = 0; i<listaUsuarios.size(); i++){
            if (listaUsuarios[i].getLogin().equals(login) && listaUsuarios[i].getSenha().equals(senha)){
                return true;
            }
            return false;
        }
    }
}

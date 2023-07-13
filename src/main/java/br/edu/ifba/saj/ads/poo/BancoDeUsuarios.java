package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;

public class BancoDeUsuarios {
    private static ArrayList<Usuario> listaUsuarios = new ArrayList<Usuario>();

    public static void addUsuario(Usuario u){
        listaUsuarios.add(u);
    }

    public boolean autenticar(String login, String senha){
        for (Usuario i : listaUsuarios){
            if (i.getLogin().equals(login) && i.getSenha().equals(senha)){
                return true;
            }
            return false;
        }
        return false;
    }
}

package br.edu.ifba.saj.ads.poo;

import java.util.List;
import java.util.ArrayList;

public class BancoDeUsuarios  {
    private ArrayList<Usuario> usuario;
    private static int capacidadeUsuario;

   /*  public BancoDeUsuarios() {
        this.usuario = new ArrayList<>();
        this.capacidadeUsuario = 10;
    }

    public static Usuario addUsuario(Usuario usuario) {
        if (this.usuario.size() < capacidadeUsuario) {
            this.usuario.add(usuario);
        } else {
            System.out.println("Lista de usuario está cheia!");
        }
    }*/

    public static Usuario addUsuario(Usuario u){

        return u;
    }

    public static Usuario autenticar(String login, String senha){

        return login, senha;
    }
}

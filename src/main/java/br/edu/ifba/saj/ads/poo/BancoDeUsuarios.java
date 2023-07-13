package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;

public class BancoDeUsuarios {
    private static ArrayList<Usuario> listaUsuarios;

    static {
        listaUsuarios = new ArrayList<>();
        listaUsuarios.add(new Usuario("usuario1", "senha1"));
        listaUsuarios.add(new Usuario("usuario2", "senha2"));
        listaUsuarios.add(new Usuario("usuario3", "senha3"));
    }

    public static void addUsuario(Usuario usuario){
        listaUsuarios.add(usuario);
    }

    public static void autenticar(String login, String senha) throws AutenticacaoInvalidaException{
        for (Usuario i : listaUsuarios){
            if (i.getLogin().equals(login) && i.getSenha().equals(senha)){
                return;
            }
        }
        throw new AutenticacaoInvalidaException("Usuario não foi encontrado ou a senha está errada");
    }
}

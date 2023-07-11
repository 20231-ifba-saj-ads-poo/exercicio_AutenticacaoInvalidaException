package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;

public class BancoDeUsuarios {
    public static ArrayList<Usuario> bancoUsuarios = new ArrayList<>();

    public static void addUsuario(Usuario usuario){
        bancoUsuarios.add(usuario);
    }

    public static void autenticar(String login, String senha) throws AutenticacaoInvalidaException {
        for (Usuario user:bancoUsuarios) {
            if(!(user.getSenha().equals(senha)) && (user.getLogin().equals(login))){
                throw new AutenticacaoInvalidaException(login);
            }
        }
    }
}

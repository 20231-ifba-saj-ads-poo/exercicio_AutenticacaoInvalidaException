package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;
import java.util.List;

public class BancoDeUsuarios {
    public static List<Usuario> usuarios = new ArrayList<>();

    public static void addUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public static void autenticar(String login, String senha) throws AutenticacaoInvalidaException {
        for (int i = 0; i <= usuarios.size(); i++) {
            if (usuarios.get(i).getLogin() == login && usuarios.get(i).getSenha() == senha) {
                System.out.println(usuarios.get(i).getLogin() +  " autenticado com sucesso!"); 
                return;
            } 
            throw new AutenticacaoInvalidaException();
        }
    }
}

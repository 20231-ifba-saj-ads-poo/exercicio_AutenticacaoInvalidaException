package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;
import java.util.List;

class BancoDeUsuarios {
    private static List<Usuario> usuariosCadastrados;

    static {
        usuariosCadastrados = new ArrayList<>();
        usuariosCadastrados.add(new Usuario("usuario", "1234"));
        usuariosCadastrados.add(new Usuario("Admim", "Admim"));
        usuariosCadastrados.add(new Usuario("0011", "864"));
    }

    public static void addUsuario(Usuario user){
        usuariosCadastrados.add(0, user);
    }

    public static void autenticar(String login, String senha) {
        for (Usuario usuario : usuariosCadastrados) {
            if (usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
                System.out.println("Usuário autenticado: " + usuario.getLogin());
                return;
            }
        }
        throw new AutenticacaoInvalidaException("Usuário " + login + " não foi encontrado ou a senha está errada");
    }
}
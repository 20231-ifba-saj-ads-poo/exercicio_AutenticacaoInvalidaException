package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;
import java.util.List;

public class BancoDeUsuarios {
    private static List<Usuario> usuarios = new ArrayList<>();

    static {
        // Cadastrando usuários no "banco de dados"
        usuarios.add(new Usuario("usuario1", "senha1"));
        usuarios.add(new Usuario("usuario2", "senha2"));
        usuarios.add(new Usuario("usuario3", "senha3"));
    }

    public static void addUsuario(Usuario usuario){
        usuarios.add(usuario);
    }

    public static void autenticar(String login, String senha) throws AutenticacaoInvalidaException {
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
                System.out.println("Usuário autenticado: " + usuario.getLogin());
                return;
            }
        }

        throw new AutenticacaoInvalidaException("Usuário ou senha inválidos");
    }
}

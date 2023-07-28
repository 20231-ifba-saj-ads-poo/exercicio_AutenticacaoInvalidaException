package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;
import java.util.List;

public class BancoDeUsuarios extends Usuario{
    private static List<Usuario> usuariosCadastrados = new ArrayList<>();

    public BancoDeUsuarios(String nome, String senha) {
        super(nome, senha);
    }

    public List<Usuario> getUsuariosCadastrados() {
        return usuariosCadastrados;
    }
    public static void inicializarUsuarios() {
        usuariosCadastrados.add(new Usuario("usuario1", "senha123"));
        usuariosCadastrados.add(new Usuario("usuario2", "12356"));
        usuariosCadastrados.add(new Usuario("admin", "admin@123"));
    }
    
    public static void addUsuario(Usuario usuario) {
        usuariosCadastrados.add(usuario);
    }

    public static Usuario buscarUsuarioPorLogin(String login) {
        for (Usuario usuario : usuariosCadastrados) {
            if (usuario.getlogin().equals(login)) {
                return usuario;
            }
        }
        return null;
    }
    public static void autenticar(String login, String senha) throws AutenticacaoInvalidaException {
        Usuario usuario = buscarUsuarioPorLogin(login);
        if (usuario == null || !usuario.getSenha().equals(senha)) {
            throw new AutenticacaoInvalidaException("Usuário (" + login + ") não foi encontrado ou a senha está errada.");
        }
    }
}






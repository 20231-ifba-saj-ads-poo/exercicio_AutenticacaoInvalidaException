package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;
import java.util.List;


public class BancoDeUsuarios {
    private static List<Usuario> usuarios= new ArrayList();

    public static void addUsuario(Usuario u) {
        usuarios.add(u);
    }

    public static void autenticar(String login, String senha) throws AutenticacaoInvalidaException{
        for (Usuario usuario : usuarios) {
             if(usuario.getTxtNome().equals(login) && usuario.getTxtSenha().equals(senha)){
            System.out.println("Usuario: "+usuario.getTxtNome()+ " encontrado!");
            return;
        }
      }
      throw new AutenticacaoInvalidaException("Usuário: " + login + " não foi encontrado ou a senha está incorreta!");
    }
}

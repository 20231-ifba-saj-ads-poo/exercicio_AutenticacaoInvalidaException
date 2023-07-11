package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;
import java.util.List;

public class BancoDeUsuarios {
 private static List<Usuario> usuarios = new ArrayList<>();
 static {
   usuarios.add(new Usuario("Usuario1", "senha1"));
   usuarios.add(new Usuario("Usuario2", "senha2"));
   usuarios.add(new Usuario("Usuario3", "senha3"));
  } 
  public static void autenticar(String login, String senha) throws AutenticacaoInvalidaException {
    for (Usuario usuario : usuarios) {
      if (usuario.getLogin().equals(login) && usuario.getSenha.equals(senha)){
        System.out.println("Usuário autenticado: " + login);
        return;
      }
    }
    throw new AutenticacaoInvalidaException("Usuário '" + login + "'não foi encontrado oua a senha está errada.");
  }  
}

package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;
import java.util.List;

public class BancodeUsuario {
    
    private static List<Usuario> bdeusuarios = new ArrayList<>();
  
   
        bdeusuarios.add(new Usuario("usuario1", "senha1"));
        bdeusuarios.add(new Usuario("usuario2", "senha2"));
        bdeusuarios.add(new Usuario("usuario3", "senha3"));
    
    public static void autenticar(String login, String senha) throws AutenticacaoInvalidaException {
        for (int i = 0; i < bdeusuarios.size(); i++) {
            if (bdeusuarios.get(i).getLogin().equals(login) && bdeusuarios.get(i).getSenha().equals(senha)) {
                System.out.println("Usuário autenticado: " + bdeusuarios.get(i).getLogin());
                return;
            }
        }
    }
}

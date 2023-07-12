package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;

public class BancoDeUsuarios{
    static ArrayList<Usuario> usuarios;

    BancoDeUsuarios(){
        usuarios = new ArrayList<Usuario>();
    }

    public static void addUsuario(Usuario user){
        usuarios.add(user);
    }

    public static void autenticar(String login, String senha) throws AutenticacaoInvalidaException{
        try {
            for(Usuario usuario : usuarios){
                if(!(login == usuario.getLogin() && senha == usuario.getSenha())){
                    throw new AutenticacaoInvalidaException("Usuario " + login + " não foi encontrado ou a senha está errada");
                }else if(login == usuario.getLogin() && senha == usuario.getSenha()){
                    System.out.println("Senha correta!");
                }
            }
        } catch (AutenticacaoInvalidaException e) {
            System.out.println(e);
        }
        
    }
}
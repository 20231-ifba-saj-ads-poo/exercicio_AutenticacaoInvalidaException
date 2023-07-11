package br.edu.ifba.saj.ads.poo;

public class ExemploAutenticacao {
    
    public static void main(String[] args) {
        try {
            BancoDeUsuarios.autenticar("Usuario1", "senha1");
        } catch (AutenticacaoInvalidaException e) {
            System.out.println("Erro de autenticação: " + e.getMessage());
        }
        
    }    
}

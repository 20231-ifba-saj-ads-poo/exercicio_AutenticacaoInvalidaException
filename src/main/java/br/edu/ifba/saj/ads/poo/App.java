package br.edu.ifba.saj.ads.poo;

public class App {
    public static void main(String[] args) {
        try {
            BancoDeUsuarios.autenticar("usuario", "2536");
        } catch (AutenticacaoInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}
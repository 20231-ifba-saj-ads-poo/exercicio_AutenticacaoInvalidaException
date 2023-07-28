package br.edu.ifba.saj.ads.poo;
public class Main {
    public static void main(String[] args) {
        BancoDeUsuarios.inicializarUsuarios();

       
        String loginSucesso = "usuario1";
        String senhaSucesso = "senha123";

        try {
            BancoDeUsuarios.autenticar(loginSucesso, senhaSucesso);
            System.out.println("Autenticação bem-sucedida para o usuário: " + loginSucesso);
        } catch (AutenticacaoInvalidaException e) {
            System.out.println(e.getMessage());
        }


        String loginFalha = "usuario2";
        String senhaFalha = "senhaerrada";

        try {
            BancoDeUsuarios.autenticar(loginFalha, senhaFalha);
            System.out.println("Autenticação bem-sucedida para o usuário: " + loginFalha);
        } catch (AutenticacaoInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}

package br.edu.ifba.saj.ads.poo;
public class Main {
    public static void main(String[] args) {
        BancoDeUsuarios.inicializarUsuarios();

       
        String login1 = "usuario1";
        String senha = "senha123";

        try {
            BancoDeUsuarios.autenticar(login1, senha);
            System.out.println("Autenticação bem-sucedida para o usuário: " + login1);
        } catch (AutenticacaoInvalidaException e) {
            System.out.println(e.getMessage());
        }


        String login2= "usuario2";
        String outsenha = "senhaerrada";

        try {
            BancoDeUsuarios.autenticar(login2, outsenha);
            System.out.println("Autenticação bem-sucedida para o usuário: " + login2);
        } catch (AutenticacaoInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
}

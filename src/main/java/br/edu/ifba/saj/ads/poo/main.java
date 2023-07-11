package br.edu.ifba.saj.ads.poo;

public class main {
    try{
        BancoDeUsuarios.autenticar("Usuario2", "senha2");
    }catch(AutenticacaoInvalidaException e){
        System.out.println("Falha na autenticação: "+ e.getLogin);
    }
}

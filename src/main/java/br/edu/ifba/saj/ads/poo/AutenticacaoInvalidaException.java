package br.edu.ifba.saj.ads.poo;

public class AutenticacaoInvalidaException extends Exception{

    public AutenticacaoInvalidaException(String userName){
        super("Usuario "+ userName +" não foi encontrado ou a senha está errada");
    }
}

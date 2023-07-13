package br.edu.ifba.saj.ads.poo;

public class AutenticacaoInvalidaException extends Exception{
    protected String mensagem;

    public AutenticacaoInvalidaException(String mensagem) {
        super(mensagem);
    }
}
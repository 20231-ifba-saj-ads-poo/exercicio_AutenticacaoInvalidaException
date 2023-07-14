package br.edu.ifba.saj.ads.poo;

public class AutenticacaoInvalidaException extends RuntimeException  {
    public AutenticacaoInvalidaException(String mensagem) {
        super(mensagem);
    }

    public AutenticacaoInvalidaException() {
        System.out.println("Falha na autenticação!");
    }
}

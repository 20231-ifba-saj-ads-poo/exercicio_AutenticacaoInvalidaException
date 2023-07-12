package br.edu.ifba.saj.ads.poo;

class AutenticacaoInvalidaException extends RuntimeException {
    public AutenticacaoInvalidaException(String mensagem) {
        super(mensagem);
    }
}
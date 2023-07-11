package br.edu.ifba.saj.ads.poo;
import java.util.ArrayList;
import java.util.List;

public class BancoDeUsuarios {
    
    private boolean test;
    static List<Usuario> banco = new ArrayList<Usuario>();
    
    public void adcionar(Usuario e){
        banco.add(e);
    }
    
    public void autenticar(String login, String senha){
        for (Usuario usuario : banco) {
            if(login == usuario.getLogin() && senha == usuario.getSenha()){
                System.out.println("Autenticacao Realizada com Sucesso");
                test = true;
                break;
            }
        }
            throw new AutenticacaoInvalidaException();
    }
}
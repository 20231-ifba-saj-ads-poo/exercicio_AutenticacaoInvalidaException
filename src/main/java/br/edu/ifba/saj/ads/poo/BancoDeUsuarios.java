package br.edu.ifba.saj.ads.poo;
import java.util.ArrayList;
import java.util.List;

public class BancoDeUsuarios {
    private static List<Usuario> bancoDeUsuarios=new ArrayList<>() ;

    static{
        bancoDeUsuarios.add(new Usuario("ADM", "adm"));
        bancoDeUsuarios.add( new Usuario("ADMIN", "adm"));
    }

public static List<Usuario> getBancoDeUsuarios() {
    return bancoDeUsuarios;
}

public static void addUsuario(Usuario u)
{
    
    bancoDeUsuarios.add(u);

}  



public static boolean autenticar(String login, String senha) throws AutenticacaoInvalidaException {
    for (Usuario percorrendo : bancoDeUsuarios) {
        if (login.equals(percorrendo.getlogin()) && senha.equals(percorrendo.getSenha())) {
            return true;
        }
    }
    throw new AutenticacaoInvalidaException("SENHA OU NOME INCORRETO !!!");
}



}


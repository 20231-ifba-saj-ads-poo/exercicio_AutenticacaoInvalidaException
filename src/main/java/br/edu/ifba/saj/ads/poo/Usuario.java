
package br.edu.ifba.saj.ads.poo;

public class Usuario {

    String[] Login;
    String[] Senha;
   


public Usuario(String[] login, String[] senha) {
        Login = login;
        Senha = senha;
    }



    public String[] getLogin() {
    return Login;
}

public String[] getSenha() {
    return Senha;
}

    
}

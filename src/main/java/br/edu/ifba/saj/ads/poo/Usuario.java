
package br.edu.ifba.saj.ads.poo;

public class Usuario {

    String[] Login;
    String[] Senha;
   


public Usuario(String[] login, String[] senha) {
        Login = login;
        Senha = senha;
    }

public void setLogin(String[] login) {
    Login = login;
}


public void setSenha(String[] senha) {
    Senha = senha;
}

    public String[] getLogin() {
    return Login;
}

public String[] getSenha() {
    return Senha;
}

public boolean verificarLogin(String Login, String Senha){
    return this.Login.equals(Login) && this.Senha.equals(Senha);
}

public void add(Usuario bdusuarios) {
}




    
}

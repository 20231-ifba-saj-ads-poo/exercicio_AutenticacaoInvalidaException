package br.edu.ifba.saj.ads.poo;

public class Usuario {
  protected String login;
    protected String senha;

    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getlogin() {
        return login;
    }

    public void setLogin(String nome) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}




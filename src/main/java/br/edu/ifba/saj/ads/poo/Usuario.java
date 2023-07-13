package br.edu.ifba.saj.ads.poo;

public class Usuario {
    private String txtNome;
    private String txtSenha;
    
    public Usuario(String txtNome, String txtSenha) {
        this.txtNome = txtNome;
        this.txtSenha = txtSenha;
    }
    public String getTxtNome() {
        return txtNome;
    }
    public void setTxtNome(String txtNome) {
        this.txtNome = txtNome;
    }
    public String getTxtSenha() {
        return txtSenha;
    }
    public void setTxtSenha(String txtSenha) {
        this.txtSenha = txtSenha;
    }
    public Object getLogin() {
        return null;
    }
    
}

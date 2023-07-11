package br.edu.ifba.saj.ads.poo;
public static void main {
    Usuario= new Usuario;
    this.Usuario= "usuario2";
    usuario2.senha= "senha2";
    try{
        BancoDeUsuarios.autenticar("usuario2","senha2");
    } catch (AutenticacaoInvalidaException e) {
     System.out.println("Falha na autenticação"+ e.getLogin);
    }
}
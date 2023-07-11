package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;
import java.util.List;

import javax.naming.AuthenticationException;

public class BancoUsuario {
    private static List<Usuario> usuarios= new ArrayList();

    public void autenticar(Usuario usu) throws AuthenticationException{
        usuarios.equals(usu);
    }

}

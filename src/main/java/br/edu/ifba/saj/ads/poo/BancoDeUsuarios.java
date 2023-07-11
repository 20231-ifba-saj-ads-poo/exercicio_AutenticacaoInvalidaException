package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;

public class BancoDeUsuarios {
    private static ArrayList <Usuario> list;
    public BancoDeUsuarios (){
        list = new ArrayList <> ();
    }
    public void addUsuariosAoBanco (Usuario user) {
        list.add (user);
    }
    public static ArrayList<Usuario> getList() {
        return list;
    }
    public static void setList(ArrayList<Usuario> list) {
        BancoDeUsuarios.list = list;
    }
}

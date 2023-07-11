package br.edu.ifba.saj.ads.poo;

import java.util.ArrayList;

public class BancoDeUsuarios {
    private static ArrayList<Usuario> list;

    public BancoDeUsuarios() {
        list = new ArrayList<>();
    }

    public static ArrayList<Usuario> getList() {
        return list;
    }

    public static void setList(ArrayList<Usuario> list) {
        BancoDeUsuarios.list = list;
    }

    public static void addUsuario(Usuario user) {
        list.add(user);
    }

    public static void autenticar(String login, String senha) {
        Usuario userbusca = new Usuario(login, senha);
        try {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).equals(userbusca)) {
                    System.out.println("Usuario " + login + "Encontrado");
                } else {
                    throw new AutenticacaoInvalidaException("Usuario " + login + "não foi encontrado ou a senha está errada");
                }
            }
        } catch (AutenticacaoInvalidaException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

    }
}

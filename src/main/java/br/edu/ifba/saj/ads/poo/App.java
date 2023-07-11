/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package br.edu.ifba.saj.ads.poo;

public class App {
    
    public static void main(String[] args){
        String login = "login";
        String senha = "senha";
        Usuario u = new Usuario(login,senha);
        BancoDeUsuarios.addUsuario(u);
        try {
            BancoDeUsuarios.autenticar(login, senha);
        } catch (AutenticacaoInvalidaException e) {
            System.out.println(e.getMessage());
        }


        try {
            BancoDeUsuarios.autenticar("SenhaErrada", "USerErrado");
        } catch (AutenticacaoInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }    
}

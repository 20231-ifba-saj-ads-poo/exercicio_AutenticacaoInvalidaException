/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package br.edu.ifba.saj.ads.poo;

public class App {
    
    public static void main(String[] args) throws AutenticacaoInvalidaException {
        BancoDeUsuarios usuarios = new BancoDeUsuarios();
        Usuario user = new Usuario("Usuario1", "1234");
        BancoDeUsuarios.addUsuario(user);

        BancoDeUsuarios.autenticar("Usuario1", "123");
        BancoDeUsuarios.autenticar("Usuario1", "1234");

    }    
}

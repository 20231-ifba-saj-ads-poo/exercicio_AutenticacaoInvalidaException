/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package br.edu.ifba.saj.ads.poo;

public class App {
    
    public static void main(String[] args) {
         BancoDeUsuarios e = new BancoDeUsuarios();
         Usuario b = new Usuario("qwe", "123");
        System.out.println(b.getLogin());
         System.out.println(b.getSenha());
         try {
             e.autenticar("qwr", "124");
         } catch (AutenticacaoInvalidaException exception) {
             System.out.println("Usuario não foi encontrado ou a senha está errada");
         }
    }
}

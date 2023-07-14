/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package br.edu.ifba.saj.ads.poo;

public class App {
    
    public static void main(String[] args) {
    
        try {
            BancoDeUsuarios.autenticar("usuario1", "senha1"); 
            BancoDeUsuarios.autenticar("usuario2", "senhaerrada");
        } catch (AutenticacaoInvalidaException e) {
            System.out.println(e.getMessage());
        }
    }
  
}

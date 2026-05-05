package com.exerciciosslide.app;

import com.exerciciosslide.controller.UsuarioController;

public class Main {
    public static void main(String[] args) {
        UsuarioController controller = new UsuarioController();

        
        controller.cadastrar("Teste", "emailinvalido", "123", "ADMIN"); 
        controller.cadastrar("Teste2", "teste@email", "123", "ADMIN");  

        controller.cadastrar("Legolas", "legolas@email.com", "36531160", "ADMIN");
       
        // 🔍 busca
        controller.buscar("legolas@email.com");
        controller.buscar("naoexiste@email.com");

        
        controller.listar();
    }
}
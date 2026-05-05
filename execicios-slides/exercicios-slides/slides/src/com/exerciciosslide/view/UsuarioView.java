package com.exerciciosslide.view;

import com.exerciciosslide.model.Usuario;
import java.util.List;

public class UsuarioView {

    public void exibirMensagem(String msg) {
        System.out.println(msg);
    }

    public void exibirUsuarios(List<Usuario> usuarios) {
        for (Usuario u : usuarios) {
            System.out.println(
                u.getNome() + " - " +
                u.getEmail() + " - " +
                u.getTelefone()
            );
        }
    }

    public void exibirUsuario(Usuario u) {
        if (u == null) {
            System.out.println("Usuário não encontrado");
        } else {
            System.out.println(
                u.getNome() + " - " +
                u.getEmail() + " - " +
                u.getTelefone()
            );
        }
    }
}
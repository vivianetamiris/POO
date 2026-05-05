package com.exerciciosslide.controller;

import com.exerciciosslide.model.Usuario;
import com.exerciciosslide.service.UsuarioService;
import com.exerciciosslide.view.UsuarioView;
import java.util.List;

public class UsuarioController {
    private UsuarioService service;
    private UsuarioView view;

    public UsuarioController() {
        this.service = new UsuarioService();
        this.view = new UsuarioView();
    }

    public void cadastrar(String nome, String email, String telefone, String tipoUsuarioQueCadastra) {
        String resultado = service.cadastrar(nome, email, telefone, tipoUsuarioQueCadastra);
        view.exibirMensagem(resultado);
    }

    public void listar() {
        List<Usuario> usuarios = service.listarUsuarios();
        view.exibirUsuarios(usuarios);
    }

    public void buscar(String email) {
        Usuario u = service.buscarPorEmail(email);
        view.exibirUsuario(u);
    }
}
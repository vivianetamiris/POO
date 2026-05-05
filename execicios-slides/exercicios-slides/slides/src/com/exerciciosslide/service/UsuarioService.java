package com.exerciciosslide.service;

import com.exerciciosslide.model.Usuario;
import com.exerciciosslide.repository.UsuarioRepository;
import java.util.List;

public class UsuarioService {
    private UsuarioRepository repository;

    public UsuarioService() {
        this.repository = new UsuarioRepository();
    }

    public String cadastrar(String nome, String email, String telefone, String tipoUsuarioQueCadastra) {

        
        if (!tipoUsuarioQueCadastra.equals("ADMIN")) {
            return "Apenas administradores podem cadastrar";
        }

    
        if (!email.contains("@") || !email.substring(email.indexOf("@")).contains(".")) {
            return "Erro: e-mail inválido";
        }

       
        if (repository.existePorEmail(email)) {
            return "Erro: e-mail já cadastrado";
        }

        Usuario novo = new Usuario(nome, email, telefone, "COMUM");

        repository.salvar(novo);
        return "Usuário cadastrado com sucesso";
    }

    public List<Usuario> listarUsuarios() {
        return repository.listar();
    }

    public Usuario buscarPorEmail(String email) {
        return repository.findByEmail(email);
    }
}
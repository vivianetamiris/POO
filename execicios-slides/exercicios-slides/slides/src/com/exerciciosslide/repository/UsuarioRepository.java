package com.exerciciosslide.repository;

import com.exerciciosslide.model.Usuario;
import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
    private static List<Usuario> banco = new ArrayList<>();

    public void salvar(Usuario usuario) {
        banco.add(usuario);
    }

    public boolean existePorEmail(String email) {
        for (Usuario u : banco) {
            if (u.getEmail().equals(email)) {
                return true;
            }
        }
        return false;
    }

    public List<Usuario> listar() {
        return new ArrayList<>(banco);
    }

    public Usuario findByEmail(String email) {
        for (Usuario u : banco) {
            if (u.getEmail().equals(email)) {
                return u;
            }
        }
        return null;
    }
}
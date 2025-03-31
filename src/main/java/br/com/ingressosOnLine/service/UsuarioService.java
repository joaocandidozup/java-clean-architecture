package br.com.ingressosOnLine.service;

import br.com.ingressosOnLine.model.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();
}

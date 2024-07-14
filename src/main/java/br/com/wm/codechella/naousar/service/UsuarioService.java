package br.com.wm.codechella.naousar.service;

import br.com.wm.codechella.naousar.model.Usuario;

import java.util.List;

public interface UsuarioService {
    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();
}

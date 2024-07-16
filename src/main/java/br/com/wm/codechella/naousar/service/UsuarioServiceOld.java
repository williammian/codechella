package br.com.wm.codechella.naousar.service;

import br.com.wm.codechella.naousar.model.UsuarioOld;

import java.util.List;

public interface UsuarioServiceOld {
    UsuarioOld cadastrarUsuario(UsuarioOld usuario);

    List<UsuarioOld> listarTodos();
}

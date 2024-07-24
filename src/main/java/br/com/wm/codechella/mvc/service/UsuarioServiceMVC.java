package br.com.wm.codechella.mvc.service;

import br.com.wm.codechella.mvc.model.UsuarioMVC;

import java.util.List;

public interface UsuarioServiceMVC {
    UsuarioMVC cadastrarUsuario(UsuarioMVC usuario);

    List<UsuarioMVC> listarTodos();
}

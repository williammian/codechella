package br.com.wm.codechella.application.gateways;

import br.com.wm.codechella.domain.entities.usuario.Usuario;

import java.util.List;

public interface RepositorioDeUsuario {
    Usuario cadastrarUsuario(Usuario usuario);

    Usuario alterarUsuario(String cpf, Usuario usuario);

    void excluirUsuario(String cpf);

    List<Usuario> listarTodos();
}

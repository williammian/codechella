package br.com.wm.codechella.application.usecases;

import br.com.wm.codechella.application.gateways.RepositorioDeUsuario;
import br.com.wm.codechella.domain.entities.usuario.Usuario;

public class AlterarUsuario {
    private final RepositorioDeUsuario repositorio;

    public AlterarUsuario(RepositorioDeUsuario repositorio) {
        this.repositorio = repositorio;
    }

    public Usuario alterarDadosUsuario(String cpf, Usuario usuario) {
        return repositorio.alterarUsuario(cpf, usuario);
    }
}

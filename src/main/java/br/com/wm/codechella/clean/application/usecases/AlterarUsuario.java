package br.com.wm.codechella.clean.application.usecases;

import br.com.wm.codechella.clean.application.gateways.RepositorioDeUsuario;
import br.com.wm.codechella.clean.domain.entities.usuario.Usuario;

public class AlterarUsuario {
    private final RepositorioDeUsuario repositorio;

    public AlterarUsuario(RepositorioDeUsuario repositorio) {
        this.repositorio = repositorio;
    }

    public Usuario alterarDadosUsuario(String cpf, Usuario usuario) {
        return repositorio.alterarUsuario(cpf, usuario);
    }
}

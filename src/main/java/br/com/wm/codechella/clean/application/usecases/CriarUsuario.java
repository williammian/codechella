package br.com.wm.codechella.clean.application.usecases;

import br.com.wm.codechella.clean.application.gateways.RepositorioDeUsuario;
import br.com.wm.codechella.clean.domain.entities.usuario.Usuario;

public class CriarUsuario {
    private final RepositorioDeUsuario repositorio;

    public CriarUsuario(RepositorioDeUsuario repositorio) {
        this.repositorio = repositorio;
    }

    public Usuario cadastrarUsuario(Usuario usuario) {
        return repositorio.cadastrarUsuario(usuario);
    }
}

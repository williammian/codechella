package br.com.wm.codechella.application.usecases;

import br.com.wm.codechella.application.gateways.RepositorioDeUsuario;

public class ExcluirUsuario {
    private final RepositorioDeUsuario repositorio;

    public ExcluirUsuario(RepositorioDeUsuario repositorio) {
        this.repositorio = repositorio;
    }

    public void excluirUsuario(String cpf) {
        repositorio.excluirUsuario(cpf);
    }
}

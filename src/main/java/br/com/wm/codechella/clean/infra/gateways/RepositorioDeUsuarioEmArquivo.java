package br.com.wm.codechella.clean.infra.gateways;

import br.com.wm.codechella.clean.application.gateways.RepositorioDeUsuario;
import br.com.wm.codechella.clean.domain.entities.usuario.Usuario;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RepositorioDeUsuarioEmArquivo implements RepositorioDeUsuario {
    List<Usuario> usuarios = new ArrayList<>();

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
        return usuario;
    }

    @Override
    public Usuario alterarUsuario(String cpf, Usuario usuario) {
        //
        return null;
    }

    @Override
    public void excluirUsuario(String cpf) {
        //
    }

    @Override
    public List<Usuario> listarTodos() {
        return this.usuarios;
    }

    public void gravaEmArquivo(String nomeArquivo) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(nomeArquivo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            fileWriter.write(this.usuarios.toString());
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

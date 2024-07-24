package br.com.wm.codechella.mvc.service;

import br.com.wm.codechella.mvc.model.UsuarioMVC;
import br.com.wm.codechella.mvc.repository.UsuarioRepositoryMVC;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImplMVC implements UsuarioServiceMVC {
    @Autowired
    private UsuarioRepositoryMVC repository;

    @Override
    public UsuarioMVC cadastrarUsuario(UsuarioMVC usuario) {
        return repository.save(usuario);
    }

    @Override
    public List<UsuarioMVC> listarTodos() {
        return repository.findAll();
    }
}

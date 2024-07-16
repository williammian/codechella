package br.com.wm.codechella.naousar.service;

import br.com.wm.codechella.naousar.model.UsuarioOld;
import br.com.wm.codechella.naousar.repository.UsuarioRepositoryOld;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImplOld implements UsuarioServiceOld {
    @Autowired
    private UsuarioRepositoryOld repository;

    @Override
    public UsuarioOld cadastrarUsuario(UsuarioOld usuario) {
        return repository.save(usuario);
    }

    @Override
    public List<UsuarioOld> listarTodos() {
        return repository.findAll();
    }
}

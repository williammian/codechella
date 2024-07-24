package br.com.wm.codechella.clean.infra.gateways;

import br.com.wm.codechella.clean.domain.entities.usuario.Usuario;
import br.com.wm.codechella.clean.infra.persistence.UsuarioEntity;

public class UsuarioEntityMapper {
    public UsuarioEntity toEntity(Usuario usuario){
        return new UsuarioEntity(usuario.getCpf(), usuario.getNome(),
                usuario.getNascimento(), usuario.getEmail());
    }

    public Usuario toDomain(UsuarioEntity entity){
        return new Usuario(entity.getCpf(), entity.getNome(), entity.getNascimento(),
                entity.getEmail());
    }
}

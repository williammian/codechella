package br.com.wm.codechella.clean.infra.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositoryDDD extends JpaRepository<UsuarioEntity, Long> {
    UsuarioEntity findByCpf(String cpf);
}

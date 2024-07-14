package br.com.wm.codechella.naousar.repository;

import br.com.wm.codechella.naousar.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

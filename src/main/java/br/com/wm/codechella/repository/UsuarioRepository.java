package br.com.wm.codechella.repository;

import br.com.wm.codechella.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}

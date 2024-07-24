package br.com.wm.codechella.mvc.repository;

import br.com.wm.codechella.mvc.model.UsuarioMVC;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositoryMVC extends JpaRepository<UsuarioMVC, Long> {
}

package br.com.wm.codechella.ddd.vendas.infra.ingresso;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoRepository extends JpaRepository<Tipo, Long> {
}

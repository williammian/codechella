package br.com.wm.codechella.ddd.vendas.aplicacao.evento;

import br.com.wm.codechella.ddd.vendas.dominio.evento.Categoria;
import br.com.wm.codechella.ddd.vendas.aplicacao.ingresso.DadosCadastroTipoIngresso;

import java.time.LocalDateTime;
import java.util.List;

public record DadosEvento(
        Long id,
        Categoria categoria,
        String descricao,
        DadosEndereco endereco,
        LocalDateTime data,
        List<DadosCadastroTipoIngresso> tipoIngressos
) {
}

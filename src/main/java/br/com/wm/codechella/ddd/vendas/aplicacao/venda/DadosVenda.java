package br.com.wm.codechella.ddd.vendas.aplicacao.venda;

import br.com.wm.codechella.ddd.vendas.aplicacao.ingresso.DadosTipoIngresso;
import br.com.wm.codechella.ddd.vendas.aplicacao.usuario.DadosUsuario;

import java.util.List;

public record DadosVenda(
        Long id,
        DadosUsuario usuario,
        List<DadosTipoIngresso> ingressos
) {
}

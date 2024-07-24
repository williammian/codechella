package br.com.wm.codechella.ddd.vendas.aplicacao.ingresso;

import br.com.wm.codechella.ddd.vendas.dominio.ingresso.Definicao;
import br.com.wm.codechella.ddd.vendas.dominio.ingresso.Setor;

public record DadosTipoIngresso(
        Integer codigo,
        Setor setor,
        Definicao definicao
) {
}

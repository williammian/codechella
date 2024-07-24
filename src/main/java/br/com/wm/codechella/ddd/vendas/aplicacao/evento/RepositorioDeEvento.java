package br.com.wm.codechella.ddd.vendas.aplicacao.evento;

import br.com.wm.codechella.ddd.vendas.dominio.evento.Evento;

public interface RepositorioDeEvento {
    Evento buscarEventoPorCidade(String cep);
}

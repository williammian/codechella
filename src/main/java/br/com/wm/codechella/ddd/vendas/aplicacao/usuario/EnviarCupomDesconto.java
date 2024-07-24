package br.com.wm.codechella.ddd.vendas.aplicacao.usuario;

import br.com.wm.codechella.ddd.vendas.dominio.usuario.Usuario;

public interface EnviarCupomDesconto {
    void enviarPara(Usuario usuario);
}

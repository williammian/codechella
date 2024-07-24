package br.com.wm.codechella.ddd.vendas.aplicacao;

public class ValidacaoException extends RuntimeException {
    public ValidacaoException(String mensagem) {
        super(mensagem);
    }
}

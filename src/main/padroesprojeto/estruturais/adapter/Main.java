package padroesprojeto.estruturais.adapter;

import padroesprojeto.estruturais.adapter.model.*;

import java.util.logging.Logger;

/**
 * Created by felansu on 6/16/15.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        final Logger LOGGER = Logger.getLogger("Método principal");

        Livro livro = new Livro("Código limpo");
        Usuario usuario = new Usuario("Felansu");

        LOGGER.info("Utilizando o adaptador");
        ControleMovimentacao controleMovimentacao = new ControleMovimentacaoAdapter();
        controleMovimentacao.registrarLocacao(livro, usuario);
        Thread.sleep(1000);
        controleMovimentacao.registrarDevolucao(livro, usuario);

        LOGGER.info("Utilizando o novo controle de movimentação");
        NovoControleMovimentacao novoControleMovimentacao = new NovoControleMovimentacao();
        novoControleMovimentacao.registrar(livro, usuario, true);
        Thread.sleep(1000);
        novoControleMovimentacao.registrar(livro, usuario, false);
    }
}

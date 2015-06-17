package padroesprojeto.estruturais.adapter.model;

import java.util.logging.Logger;

/**
 * Created by felansu on 6/16/15.
 */
public class ControleMovimentacao {
    private static final Logger LOGGER = Logger.getLogger(ControleMovimentacao.class.toString());

    public void registrarLocacao(Livro livro, Usuario usuario) {
        LOGGER.info("Registrando locação do livro '" + livro.getTitulo() + "' " +
                "para usuário '" + usuario.getNome() + "' ");
    }

    public void registrarDevolucao(Livro livro, Usuario usuario) {
        LOGGER.info("Registrando devolução do livro '" + livro.getTitulo() + "' " +
                "para usuário '" + usuario.getNome() + "' ");
    }

}

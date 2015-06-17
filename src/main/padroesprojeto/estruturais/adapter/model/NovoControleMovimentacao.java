package padroesprojeto.estruturais.adapter.model;

import java.util.logging.Logger;

/**
 * Created by felansu on 6/17/15.
 */
public class NovoControleMovimentacao{
    private static final Logger LOGGER = Logger.getLogger(ControleMovimentacao.class.toString());

    public void registrar(Livro livro, Usuario usuario, boolean locacao) {
        if (locacao) {
            LOGGER.info("Registrando locação do livro '" + livro.getTitulo() + "' " +
                    "para usuário '" + usuario.getNome() + "' ");
        }else{
            LOGGER.info("Registrando devolução do livro '" + livro.getTitulo() + "' " +
                    "para usuário '" + usuario.getNome() + "' ");
        }

    }

}

package padroesprojeto.estruturais.adapter.model;

/**
 * Created by felansu on 6/17/15.
 */
public class ControleMovimentacaoAdapter extends ControleMovimentacao {

    private NovoControleMovimentacao novoControleMovimentacao;

    public ControleMovimentacaoAdapter() {
        this.novoControleMovimentacao = new NovoControleMovimentacao();
    }

    @Override
    public void registrarLocacao(Livro livro, Usuario usuario) {
        novoControleMovimentacao.registrar(livro, usuario, true);
    }

    @Override
    public void registrarDevolucao(Livro livro, Usuario usuario) {
        novoControleMovimentacao.registrar(livro, usuario, false);

    }


}

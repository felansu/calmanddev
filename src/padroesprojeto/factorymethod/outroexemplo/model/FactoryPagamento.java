package padroesprojeto.factorymethod.outroexemplo.model;

/**
 * Created by felansu on 03/06/2015.
 */
public class FactoryPagamento {
    public final static int PAGAMENTO_FUNCIONARIO = 1;
    public final static int PAGAMENTO_FORNECEDOR = 2;

    public Pagamento criar(int tipo){
        switch (tipo){
            case PAGAMENTO_FORNECEDOR:
                return new PagamentoFornecedor();
            case PAGAMENTO_FUNCIONARIO:
                return new PagamentoFuncionario();
        }
        throw new IllegalArgumentException("Tipo de pagamento desconhecido.");
    }
}

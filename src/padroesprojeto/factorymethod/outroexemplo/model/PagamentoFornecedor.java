package padroesprojeto.factorymethod.outroexemplo.model;

/**
 * Created by felansu on 03/06/2015.
 */
public class PagamentoFornecedor implements Pagamento {
    @Override
    public void realizarPagamento() {
        System.out.println("Realizando pagamento para fornecedor { . . . }");
    }
}

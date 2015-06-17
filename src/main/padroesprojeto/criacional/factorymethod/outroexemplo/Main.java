package padroesprojeto.criacional.factorymethod.outroexemplo;

import padroesprojeto.criacional.factorymethod.outroexemplo.model.FactoryPagamento;

/**
 * Created by felansu on 03/06/2015.
 */
public class Main {
    public static void main(String[] args) {
        new FactoryPagamento().criar(FactoryPagamento.PAGAMENTO_FORNECEDOR).realizarPagamento();
        new FactoryPagamento().criar(FactoryPagamento.PAGAMENTO_FUNCIONARIO).realizarPagamento();
    }
}

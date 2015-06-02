package padroesprojeto.abstractfactorymethod.model;

/**
 * Created by felansu on 31/05/2015.
 */
public class AdocaoFactory {

    protected static final int DOENTE = 1;
    protected static final int SAUDAVEL = 2;

    public Adocao criar(int tipo) {
        if (tipo == 1) {
            return new AdocaoAnimalDoente();
        } else if (tipo == 2) {
            return new AdocaoAnimalSaudavel();
        } else {
            throw new IllegalArgumentException("Tipo de saúde não encontrada !");
        }
    }
}

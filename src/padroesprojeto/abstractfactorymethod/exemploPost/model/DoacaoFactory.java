package padroesprojeto.abstractfactorymethod.exemploPost.model;

/**
 * Created by felansu on 31/05/2015.
 */
public class DoacaoFactory {

    protected static final int DOENTE   = 1;
    protected static final int SAUDAVEL = 2;

    public Doacao criar(int tipo){
        if(tipo == 1){
            return new DoacaoAnimalDoente();
        }else if(tipo == 2){
            return new DoacaoAnimalSaudavel();
        }else{
            throw new IllegalArgumentException("Tipo de sa�de n�o encontrada !");
        }
    }
}

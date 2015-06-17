package padroesprojeto.criacional.abstractfactorymethod.exemploPost.model;

/**
 * Created by felansu on 31/05/2015.
 */
public class AnimalSaudavelComunicator implements ComunicadorFactory{

    @Override
    public Adocao fazerAdocao() {
        return new AdocaoFactory().criar(AdocaoFactory.SAUDAVEL) ;
    }

    @Override
    public Doacao fazerDoacao() {
        return new DoacaoFactory().criar(DoacaoFactory.SAUDAVEL);
    }
}

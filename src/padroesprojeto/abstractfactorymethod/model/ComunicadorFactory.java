package padroesprojeto.abstractfactorymethod.model;

/**
 * Created by felansu on 31/05/2015.
 */
public interface ComunicadorFactory {

    Adocao fazerAdocao();
    Doacao fazerDoacao();

}

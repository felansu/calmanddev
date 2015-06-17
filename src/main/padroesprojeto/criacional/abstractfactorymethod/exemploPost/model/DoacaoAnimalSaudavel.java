package padroesprojeto.criacional.abstractfactorymethod.exemploPost.model;

/**
 * Created by felansu on 31/05/2015.
 */
public class DoacaoAnimalSaudavel implements Doacao {
    @Override
    public void doar(Animal animal) {
        System.out.println("Doação de animal saudável: " +animal.getNome());
    }
}

package padroesprojeto.abstractfactorymethod.exemploPost.model;

/**
 * Created by felansu on 31/05/2015.
 */
public class AdocaoAnimalDoente implements Adocao {

    @Override
    public void adotar(Animal animal) {
        System.out.println("Adoção de animal que precisa de cuidados: " +animal.getNome());
    }
}

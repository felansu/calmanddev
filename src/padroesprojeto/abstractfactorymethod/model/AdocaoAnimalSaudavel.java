package padroesprojeto.abstractfactorymethod.model;

/**
 * Created by felansu on 31/05/2015.
 */
public class AdocaoAnimalSaudavel implements Adocao {

    @Override
    public void adotar(Animal animal) {
        System.out.println("Adoção de animal saudável: " +animal.getNome());
    }
}

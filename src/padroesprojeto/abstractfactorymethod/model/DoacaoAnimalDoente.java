package padroesprojeto.abstractfactorymethod.model;

/**
 * Created by felansu on 31/05/2015.
 */
public class DoacaoAnimalDoente implements Doacao {
    @Override
    public void doar(Animal animal) {
        System.out.println("Doação de animal doente: " +animal.getNome());
    }
}

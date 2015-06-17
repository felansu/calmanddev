package padroesprojeto.criacional.abstractfactorymethod.exemploPost;

import padroesprojeto.criacional.abstractfactorymethod.exemploPost.model.Animal;
import padroesprojeto.criacional.abstractfactorymethod.exemploPost.model.AnimalDoenteComunicator;
import padroesprojeto.criacional.abstractfactorymethod.exemploPost.model.AnimalSaudavelComunicator;
import padroesprojeto.criacional.abstractfactorymethod.exemploPost.model.ComunicadorFactory;

/**
 * Created by felansu on 31/05/2015.
 */
public class Main {

    public static void main(String[] args) {
        ComunicadorFactory comunicator = new AnimalDoenteComunicator();
        Animal rocky = new Animal("Rocky");


        comunicator.fazerAdocao().adotar(rocky);
        comunicator.fazerDoacao().doar(rocky);

        comunicator = new AnimalSaudavelComunicator();

        comunicator.fazerAdocao().adotar(rocky);
        comunicator.fazerDoacao().doar(rocky);
    }

}

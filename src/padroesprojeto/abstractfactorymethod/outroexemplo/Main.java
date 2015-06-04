package padroesprojeto.abstractfactorymethod.outroexemplo;

import padroesprojeto.abstractfactorymethod.outroexemplo.model.Comunicador;
import padroesprojeto.abstractfactorymethod.outroexemplo.model.ComunicadorHeavy;
import padroesprojeto.abstractfactorymethod.outroexemplo.model.ComunicadorHippie;

/**
 * Created by felansu on 03/06/2015.
 */
public class Main {
    public static void main(String[] args) {
        new ComunicadorHeavy().criarCalca().vestir();
        new ComunicadorHeavy().criarCamisa().vestir();

        new ComunicadorHippie().criarCalca().vestir();
        new ComunicadorHippie().criarCamisa().vestir();
    }
}

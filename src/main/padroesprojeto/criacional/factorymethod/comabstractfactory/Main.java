package padroesprojeto.criacional.factorymethod.comabstractfactory;

import padroesprojeto.criacional.factorymethod.comabstractfactory.model.Comunicator;
import padroesprojeto.criacional.factorymethod.comabstractfactory.model.ComunicatorJAVA;
import padroesprojeto.criacional.factorymethod.comabstractfactory.model.ComunicatorPHP;

/**
 * Created by felansu on 31/05/2015.
 */
public class Main {

    public static void main(String[] args) {

        Comunicator factory = new ComunicatorJAVA();
        System.out.println("Anos de experiência de um desenvolvedor: "
                + factory.experienciaJunior().getAnosExperiencia());

        factory = new ComunicatorPHP();
        System.out.println("Anos de experiência de um desenvolvedor: "
                + factory.experienciaPleno().getAnosExperiencia());


    }

}
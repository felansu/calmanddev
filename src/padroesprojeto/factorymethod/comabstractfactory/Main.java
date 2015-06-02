package padroesprojeto.factorymethod.comabstractfactory;

import padroesprojeto.factorymethod.comabstractfactory.model.Comunicator;
import padroesprojeto.factorymethod.comabstractfactory.model.ComunicatorJAVA;
import padroesprojeto.factorymethod.comabstractfactory.model.ComunicatorPHP;
import padroesprojeto.factorymethod.comdivisao.model.DesenvolvedorFactory;
import padroesprojeto.factorymethod.comdivisao.model.DesenvolvedorJavaFactory;
import padroesprojeto.factorymethod.comdivisao.model.DesenvolvedorPHPFactory;

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
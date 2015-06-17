package padroesprojeto.criacional.factorymethod.comabstractfactory.model;

/**
 * Created by felansu on 31/05/2015.
 */
public class ComunicatorPHP implements Comunicator {

    DesenvolvedorPHPFactory factory = new DesenvolvedorPHPFactory();

    public IDesenvolvedor experienciaJunior() {
        return factory.instanciacao(DesenvolvedorPHPFactory.JUNIOR);
    }

    @Override
    public IDesenvolvedor experienciaPleno() {
        return factory.instanciacao(DesenvolvedorPHPFactory.PLENO);
    }

    @Override
    public IDesenvolvedor experienciaSenior() {
        return factory.instanciacao(DesenvolvedorPHPFactory.SENIOR);
    }
}

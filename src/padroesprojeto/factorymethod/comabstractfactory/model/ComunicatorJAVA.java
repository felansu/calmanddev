package padroesprojeto.factorymethod.comabstractfactory.model;

/**
 * Created by felansu on 31/05/2015.
 */
public class ComunicatorJAVA implements Comunicator {

    DesenvolvedorJavaFactory factory = new DesenvolvedorJavaFactory();

    public IDesenvolvedor experienciaJunior() {
        return factory.instanciacao(DesenvolvedorJavaFactory.JUNIOR);
    }

    @Override
    public IDesenvolvedor experienciaPleno() {
        return factory.instanciacao(DesenvolvedorJavaFactory.PLENO);
    }

    @Override
    public IDesenvolvedor experienciaSenior() {
        return factory.instanciacao(DesenvolvedorJavaFactory.SENIOR);
    }

}

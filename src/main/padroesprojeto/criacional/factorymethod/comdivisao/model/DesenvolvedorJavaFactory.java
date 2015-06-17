package padroesprojeto.criacional.factorymethod.comdivisao.model;

/**
 * Created by felansu on 31/05/2015.
 */
public class DesenvolvedorJavaFactory extends DesenvolvedorFactory {

    public IDesenvolvedor instanciacao(int tipo) {

        switch (tipo) {
            case JUNIOR:
                return new DesenvolvedorJavaJunior();
            case PLENO:
                return new DesenvolvedorJavaPleno();
            case SENIOR:
                return new DesenvolvedorJavaSenior();
        }
        throw new IllegalArgumentException("Tipo de desenvolvedor n�o foi encontrado !");

    }

}

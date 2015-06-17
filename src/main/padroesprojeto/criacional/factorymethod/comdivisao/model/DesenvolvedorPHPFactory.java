package padroesprojeto.criacional.factorymethod.comdivisao.model;

/**
 * Created by felansu on 31/05/2015.
 */
public class DesenvolvedorPHPFactory extends DesenvolvedorFactory {

    public IDesenvolvedor instanciacao(int tipo) {

        switch (tipo) {
            case JUNIOR:
                return new DesenvolvedorPHPJunior();
            case PLENO:
                return new DesenvolvedorPHPPleno();
            case SENIOR:
                return new DesenvolvedorPHPSenior();
        }
        throw new IllegalArgumentException("Tipo de desenvolvedor n�o foi encontrado !");

    }

}

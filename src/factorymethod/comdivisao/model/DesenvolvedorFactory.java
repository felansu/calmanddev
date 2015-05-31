package factorymethod.comdivisao.model;

/**
 * Created by felansu on 30/05/2015.
 */
public class DesenvolvedorFactory {

    public final static int JUNIOR = 1;
    public final static int PLENO = 2;
    public final static int SENIOR = 3;

    public IDesenvolvedor instanciacao(int tipo) {

        switch (tipo) {
            case JUNIOR:
                return new DesenvolvedorJunior();
            case PLENO:
                return new DesenvolvedorPleno();
            case SENIOR:
                return new DesenvolvedorSenior();
        }
        throw new IllegalArgumentException("Tipo de desenvolvedor não foi encontrado !");
    }

}

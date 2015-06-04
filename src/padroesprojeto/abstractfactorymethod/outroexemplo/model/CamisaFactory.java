package padroesprojeto.abstractfactorymethod.outroexemplo.model;

/**
 * Created by felansu on 03/06/2015.
 */
public class CamisaFactory {

    public static final int HIPPIE = 1;
    public static final int HEAVY = 2;

    public Camisa criar(int tipo){
        switch (tipo){
            case HIPPIE:
                return new CamisaHippie();
            case HEAVY:
                return new CamisaHeavy();
        }
        throw new IllegalArgumentException("Tipo de estilo não conhecido");
    }



}

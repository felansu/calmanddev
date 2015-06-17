package padroesprojeto.criacional.abstractfactorymethod.outroexemplo.model;

/**
 * Created by felansu on 03/06/2015.
 */
public class CalcaFactory {

    public static final int HIPPIE = 1;
    public static final int HEAVY = 2;

    public Calca criar(int tipo){
        switch (tipo){
            case HIPPIE:
                return new CalcaHippie();
            case HEAVY:
                return new CalcaHeavy();
        }
        throw new IllegalArgumentException("Tipo de estilo não conhecido");
    }



}

package padroesprojeto.abstractfactorymethod.outroexemplo.model;

/**
 * Created by felansu on 03/06/2015.
 */
public class CamisaHeavy implements Camisa {
    @Override
    public void vestir() {
        System.out.println("Vestindo camisa heavy");
    }
}

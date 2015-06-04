package padroesprojeto.abstractfactorymethod.outroexemplo.model;

/**
 * Created by felansu on 03/06/2015.
 */
public class ComunicadorHeavy implements Comunicador {
    @Override
    public Calca criarCalca() {
        return new CalcaFactory().criar(CalcaFactory.HEAVY);
    }

    @Override
    public Camisa criarCamisa() {
        return new CamisaFactory().criar(CamisaFactory.HEAVY);
    }
}

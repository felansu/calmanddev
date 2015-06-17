package padroesprojeto.criacional.factorymethod.sem;


import padroesprojeto.criacional.factorymethod.sem.model.IDesenvolvedor;
import padroesprojeto.criacional.factorymethod.sem.model.DesenvolvedorJunior;

/**
 * Created by felansu on 28/05/2015.
 */
public class Main {

    public static void main(String[] args) {
        IDesenvolvedor vinicius = new DesenvolvedorJunior();
        System.out.print(vinicius.getAnosExperiencia());
    }

}
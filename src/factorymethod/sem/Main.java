package factorymethod.sem;


import factorymethod.sem.model.DesenvolvedorJunior;
import factorymethod.sem.model.IDesenvolvedor;

/**
 * Created by felansu on 28/05/2015.
 */
public class Main {

    public static void main(String[] args) {
        IDesenvolvedor vinicius = new DesenvolvedorJunior();
        System.out.print(vinicius.getAnosExperiencia());
    }

}
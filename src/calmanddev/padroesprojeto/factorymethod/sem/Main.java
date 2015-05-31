package calmanddev.padroesprojeto.factorymethod.sem;


import calmanddev.padroesprojeto.factorymethod.sem.model.IDesenvolvedor;
import calmanddev.padroesprojeto.factorymethod.sem.model.DesenvolvedorJunior;

/**
 * Created by felansu on 28/05/2015.
 */
public class Main {

    public static void main(String[] args) {
        IDesenvolvedor vinicius = new DesenvolvedorJunior();
        System.out.print(vinicius.getAnosExperiencia());
    }

}
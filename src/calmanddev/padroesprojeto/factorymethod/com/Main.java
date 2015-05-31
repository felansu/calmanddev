package calmanddev.padroesprojeto.factorymethod.com;


import calmanddev.padroesprojeto.factorymethod.com.model.DesenvolvedorFactory;

/**
 * Created by felansu on 30/05/2015.
 */
public class Main {

    public static void main(String[] args) {

        DesenvolvedorFactory factory = new DesenvolvedorFactory();
        int anos = factory.instanciacao(DesenvolvedorFactory.JUNIOR).getAnosExperiencia();
        System.out.println(anos);

    }

}
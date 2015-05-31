package factorymethod.comdivisao;

import factorymethod.comdivisao.model.DesenvolvedorFactory;
import factorymethod.comdivisao.model.DesenvolvedorJavaFactory;
import factorymethod.comdivisao.model.DesenvolvedorPHPFactory;

/**
 * Created by felansu on 31/05/2015.
 */
public class Main {

    public static void main(String[] args) {

        /*
        * Factory padrão
        */
        DesenvolvedorFactory factory = new DesenvolvedorFactory();
        System.out.println("Anos de experiência de um desenvolvedor: "
                + factory.instanciacao(DesenvolvedorFactory.JUNIOR).getAnosExperiencia());

        /*
        * Factory especializada em JAVA
        */
        DesenvolvedorJavaFactory factoryJava = new DesenvolvedorJavaFactory();
        System.out.println("Anos de experiência de um desenvolvedor JAVA Junior: "
                + factoryJava.instanciacao(DesenvolvedorJavaFactory.JUNIOR).getAnosExperiencia());

        /*
        * Factory especializada em PHP
        */
        DesenvolvedorPHPFactory factoryPHP = new DesenvolvedorPHPFactory();
        System.out.println("Anos de experiência de um desenvolvedor PHP Junior: "
                + factoryPHP.instanciacao(DesenvolvedorPHPFactory.JUNIOR).getAnosExperiencia());

    }

}
package padroesprojeto.builder;

import padroesprojeto.builder.model.PessoaAmericanaBuilder;
import padroesprojeto.builder.model.PessoaBuilder;
import padroesprojeto.builder.model.PessoaEuropeiaBuilder;

/**
 * Created by felansu on 06/06/2015.
 */
public class Main {
    public static void main(String[] args) {
        PessoaBuilder pessoaBuilder = new PessoaEuropeiaBuilder();
        pessoaBuilder.buildNacionalidade("Espanhola");
        pessoaBuilder.buildNome("Ferran");
        pessoaBuilder.buildAltura("172 cm");
        pessoaBuilder.buildPeso("68 kg");

        System.out.println(pessoaBuilder.criar());


        pessoaBuilder = new PessoaAmericanaBuilder();
        pessoaBuilder.buildNacionalidade("Neoyorkino");
        pessoaBuilder.buildNome("Bush");
        pessoaBuilder.buildAltura("154 cm");
        pessoaBuilder.buildPeso("54 kg");

        System.out.println(pessoaBuilder.criar());
    }
}

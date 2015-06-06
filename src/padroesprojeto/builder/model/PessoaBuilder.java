package padroesprojeto.builder.model;

/**
 * Created by felansu on 06/06/2015.
 */
public interface PessoaBuilder {

    void buildNacionalidade(String nacionalidade);

    void buildNome(String nome);

    void buildAltura(String altura);

    void buildPeso(String peso);

    Pessoa criar();
}

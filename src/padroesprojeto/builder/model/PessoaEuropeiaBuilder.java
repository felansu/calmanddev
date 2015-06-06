package padroesprojeto.builder.model;

/**
 * Created by felansu on 06/06/2015.
 */
public class PessoaEuropeiaBuilder implements PessoaBuilder {

    private String nacionalidade;
    private String nome;
    private String altura;
    private String peso;

    @Override
    public void buildNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    @Override
    public void buildNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void buildAltura(String altura) {
        this.altura = altura;
    }

    @Override
    public void buildPeso(String peso) {
        this.peso = peso;
    }

    @Override
    public Pessoa criar() {
        return new PessoaEuropeia(nacionalidade, nome, altura, peso);
    }
}

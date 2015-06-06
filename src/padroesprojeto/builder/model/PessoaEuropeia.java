package padroesprojeto.builder.model;

/**
 * Created by felansu on 06/06/2015.
 */
public class PessoaEuropeia implements Pessoa {

    private String nacionalidade;
    private String nome;
    private String altura;
    private String peso;

    public PessoaEuropeia(String nacionalidade, String nome, String altura, String peso) {
        this.nacionalidade = nacionalidade;
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public String getNacionalidade() {
        return nacionalidade;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getAltura() {
        return altura;
    }

    @Override
    public String getPeso() {
        return peso;
    }

    @Override
    public String toString() {
        return "PessoaEuropeia{" +
                "nacionalidade='" + nacionalidade + '\'' +
                ", nome='" + nome + '\'' +
                ", altura='" + altura + '\'' +
                ", peso='" + peso + '\'' +
                '}';
    }
}

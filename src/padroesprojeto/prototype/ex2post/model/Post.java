package padroesprojeto.prototype.ex2post.model;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;


/**
 * Created by felansu on 08/06/2015.
 */
public class Post implements Prototype<Post> {

    private String titulo;
    private String conteudo;
    private LocalDateTime dataCriacao;
    private Set tags;

    public Post(String titulo, String conteudo, LocalDateTime dataCriacao, Set tags) {
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.dataCriacao = dataCriacao;
        this.tags = tags;
    }

    @Override
    public Post clone() {
        String titulo = "Copia do post: " + this.titulo;
        String conteudo = this.conteudo;
        LocalDateTime dataCriacao = this.dataCriacao;
        tags = new HashSet<>(this.tags);
        return new Post(titulo, conteudo, dataCriacao, tags);
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public void setTags(Set tags) {
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "\n----------" +
                "\n Post " + titulo +
                "\n * Conteudo: " + conteudo +
                "\n * Data de criação: " + dataCriacao +
                "\n * Tags: " + tags;
    }
}

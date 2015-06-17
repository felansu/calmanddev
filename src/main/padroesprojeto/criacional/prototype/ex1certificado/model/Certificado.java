package padroesprojeto.criacional.prototype.ex1certificado.model;

/**
 * Created by felansu on 08/06/2015.
 */
public class Certificado implements Prototype<Certificado>{

    private String titulo;
    private String curso;
    private String aluno;

    public Certificado(String titulo, String curso, String aluno) {
        this.titulo = titulo;
        this.curso = curso;
        this.aluno = aluno;
    }

    @Override
    public Certificado clone() {
        String titulo = "Copia do certificado: " + this.titulo;
        String curso = this.curso;
        String aluno = this.aluno;
        return new Certificado(titulo, curso, aluno);
    }

    @Override
    public String toString() {
        return "Post{" +
                "titulo='" + titulo + '\'' +
                ", curso='" + curso + '\'' +
                ", aluno='" + aluno + '\'' +
                '}';
    }

    public void setAluno(String aluno) {
        this.aluno = aluno;
    }
}

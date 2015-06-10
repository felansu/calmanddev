package padroesprojeto.prototype.ex1certificado;

import padroesprojeto.prototype.ex1certificado.model.Certificado;

/**
 * Created by felansu on 08/06/2015.
 */
public class Main {

    private static Certificado certificado;

    private static void carregarDados(){
        String titulo = "Diploma finalização de curso";
        String curso = "Sistemas de Informação";
        String aluno = "Aparecida de Fátima Pires Barbosa";
        certificado = new Certificado(titulo, curso, aluno);
    }

    public static void main(String[] args) {
        carregarDados();
        System.out.println(certificado);

        Certificado clone = certificado.clone();
        clone.setAluno("Ferran Gonzalez Alonso");
        System.out.println(clone);
    }

}

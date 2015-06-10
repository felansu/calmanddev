package padroesprojeto.prototype.ex2post;

import padroesprojeto.prototype.ex2post.model.Post;

import java.io.*;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.regex.Pattern;

import static java.util.concurrent.TimeUnit.SECONDS;

/**
 * Created by felansu on 08/06/2015.
 */
public class Main {

    private static Post post;

    public static void main(String[] args) {
        String titulo = "Padrão de projetos Prototype";
        String conteudo = "Este é o contudo do padrão";
        LocalDateTime dataCriacao = LocalDateTime.now();
        Set tags = new HashSet<>(Arrays.asList("Padrões de projeto", "Criação"));
        post = new Post(titulo, conteudo, dataCriacao, tags);

        iniciarThread();

        post.setDataCriacao(LocalDateTime.now());

        Scanner sc = new Scanner(System.in);
        System.out.print("Titulo: ");
        post.setTitulo(sc.nextLine());

        System.out.print("Conteudo: ");
        post.setConteudo(sc.nextLine());

        System.out.print("Tags: ");
        post.setTags(new HashSet<>(Arrays.asList(sc.nextLine().split(Pattern.quote(",")))));
    }

    public static void iniciarThread() {
        Runnable threadSalvadora = () -> salvar();
        Executors.newScheduledThreadPool(100).scheduleAtFixedRate(threadSalvadora, 5, 5, SECONDS);
    }

    private static void salvar() {
        Writer out = null;
        try {
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("postTemp.txt"), "UTF-8"));
            out.write(post.toString());
            out.close();
        } catch (UnsupportedEncodingException | FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
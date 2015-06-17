package padroesprojeto.criacional.singleton;

import java.util.Map;

/**
 * Created by felansu on 6/15/15.
 */
public class Main {

    public static void main(String[] args) {
        Map<String, String> primeiraInstancia = Configuracao.getConfiguracoes();

        Map<String, String> segundaInstancia = Configuracao.getConfiguracoes();
        segundaInstancia.put("Chave","Valor da segunda instância");

        if (primeiraInstancia == segundaInstancia){
            System.out.println("São a mesma instância");
            System.out.println(primeiraInstancia);
            System.out.println(segundaInstancia);
        }
    }

}

import java.util.HashMap;
import java.util.Map;

/**
 * Created by felansu on 6/15/15.
 */
public class Configuracao {

    private static Map<String, String> configuracoes;

    private Configuracao() {
    }

    private static void carregaConfiguracoes() {
        configuracoes = new HashMap<>();
        configuracoes.put("URL", "www.calmanddev.wordpress.com");
        configuracoes.put("USUARIO", "felansu");
        configuracoes.put("SENHA", "123456");
    }

    public static synchronized Map<String, String> getConfiguracoes() {
        if (configuracoes == null) carregaConfiguracoes();
        return configuracoes;
    }

}

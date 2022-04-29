package Subsistema3.contato;


public class ContatoApi {
    private static ContatoApi instancia = new ContatoApi();

    private ContatoApi() {
        super();
    }

    public static ContatoApi getInstancia() {
        return instancia;
    }

    public String solicitarEmail(String cpf) {
        return "venilton@yahoo.com.br";
    }

    public String solicitarLinkedin(String cpf) {
        return "www.linkedin.com/in/veniltondasilva";
    }

    }

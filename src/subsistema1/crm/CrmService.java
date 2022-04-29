package subsistema1.crm;

public class CrmService {

    private CrmService() {
        super();
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado, Contato contatos) {
		System.out.println("Cliente salvo no sistema de CRM:");
		System.out.println(nome);
		System.out.println(cep);
		System.out.println(cidade);
		System.out.println(estado);
		System.out.println(contatos.getEmail());
		System.out.println(contatos.getLinkedin());
	}
}

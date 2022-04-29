package desafio.padroes.javadio.facade;
import subsistema1.crm.CrmService;
import subsistema2.CepApi;
import Subsistema3.contato.ContatoApi;

public class Facade {

   public void migrarCliente(String cpf, String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep);
		Contato contatos = new Contato();
		contatos.setEmail(ContatoApi.getInstancia().solicitarEmail(cpf));
		contatos.setLinkedin(ContatoApi.getInstancia().solicitarLinkedin(cpf));

		CrmService.gravarCliente(nome, cep, cidade, estado, contatos);
	}
}

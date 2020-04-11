package br.com.webMagaLu.steps;

import br.com.webMagaLu.action.WebInteractions;
import br.com.webMagaLu.page.ProdutoPage;
import br.com.webMagaLu.tdm.TDM;
import io.cucumber.java8.En;

public class ProdutoSteps implements En {

	public ProdutoSteps() {
		WebInteractions w = new WebInteractions();

		When("seleciono a capacidade {string}", (String capacidade) -> {
			w.esperarPaginaCarregar();
			w.esperarElementoExistirNaTela(ProdutoPage.SEL_CAPACIDADE, 20);
			w.selecionarByVisibleText(ProdutoPage.SEL_CAPACIDADE, capacidade);
			TDM.produto.setCapacidade(capacidade);
			TDM.produto.setPreco(w.getTexto(ProdutoPage.LBL_PRECO));
		});

		When("clico no botão Adicionar à sacola", () -> {
			w.clicar(ProdutoPage.BTN_ADCIONAR_SACOLA);
		});

		When("preencho o cep {string}", (String cep) -> {
			w.esperarElementoExistirNaTela(ProdutoPage.TXT_CEP, 20);
			w.escrever(ProdutoPage.TXT_CEP, cep);
			TDM.entrega.setCep(cep);
			w.clicar(ProdutoPage.BTN_CEP_OK);
		});

		Then("valido o label endereco com o texto {string}", (String endereco) -> {
			w.esperarElementoExistirNaTela(ProdutoPage.LBL_ENDERECO, 10);
			w.validarTexto(ProdutoPage.LBL_ENDERECO, endereco);
			TDM.entrega.setEndereco(endereco);
		});

		Then("valido o label de erro na busca do cep com o texto {string}", (String texto) -> {
			w.esperarElementoExistirNaTela(ProdutoPage.LBL_CEP_ERRO, 30);
			w.validarTextoContido(ProdutoPage.LBL_CEP_ERRO, texto);
		});
	}

}

package br.com.webMagaLu.steps;

import br.com.webMagaLu.action.WebInteractions;
import br.com.webMagaLu.page.CarrinhoPage;
import br.com.webMagaLu.tdm.TDM;
import io.cucumber.java8.En;

public class CarrinhoSteps implements En {

	public CarrinhoSteps() {
		WebInteractions w = new WebInteractions();

		Then("valido o produto adcionado no carrinho", () -> {
			w.esperarPaginaCarregar();
			w.esperarElementoExistirNaTela(CarrinhoPage.LBL_TITULO_PRODUTO, 20);
			w.validarTextoContido(CarrinhoPage.LBL_TITULO_PRODUTO, TDM.produto.getNome());
			w.validarTextoContido(CarrinhoPage.LBL_TITULO_PRODUTO, TDM.produto.getCapacidade());
			w.validarTextoContido(CarrinhoPage.LBL_PRECO, TDM.produto.getPreco());
		});

		Then("valido os dados do cep no carrinho", () -> {
			w.esperarPaginaCarregar();
			w.esperarElementoExistirNaTela(CarrinhoPage.LBL_CEP, 20);
			w.validarTexto(CarrinhoPage.LBL_CEP, TDM.entrega.getCep());
			w.validarTexto(CarrinhoPage.LBL_ENDERECO, TDM.entrega.getEndereco());

		});

		When("preencho o cep {string} no carrinho", (String cep) -> {
			w.esperarPaginaCarregar();
			w.esperarElementoExistirNaTela(CarrinhoPage.TXT_CEP, 10);
			w.escrever(CarrinhoPage.TXT_CEP, cep);
			TDM.entrega.setCep(cep);
			w.clicar(CarrinhoPage.BTN_OK_CEP);
		});

		Then("valido o label cep no carrinho", () -> {
			w.esperarPaginaCarregar();
			w.esperarElementoExistirNaTela(CarrinhoPage.LBL_CEP, 20);
			w.validarTexto(CarrinhoPage.LBL_CEP, TDM.entrega.getCep());
		});

		Then("valido o label endereço {string} no carrinho", (String endereco) -> {
			w.esperarPaginaCarregar();
			w.esperarElementoExistirNaTela(CarrinhoPage.LBL_ENDERECO, 20);
			w.validarTextoContido(CarrinhoPage.LBL_ENDERECO, endereco);
		});

	}

}

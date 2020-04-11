package br.com.webMagaLu.steps;

import br.com.webMagaLu.action.WebInteractions;
import br.com.webMagaLu.page.HomePage;
import br.com.webMagaLu.tdm.TDM;
import io.cucumber.java8.En;

public class HomeSteps implements En{
	
	public HomeSteps() {
		WebInteractions w = new WebInteractions();
		When("preencho o campo de busca {string}",(String busca)->{
			w.esperarPaginaCarregar();
			w.esperarElementoExistirNaTela(HomePage.TXT_BUSCAR, 20);
			w.escrever(HomePage.TXT_BUSCAR, busca);
			TDM.produto.setNome(busca);
		});
		
		When("clico no botão buscar",()->{
			w.esperarPaginaCarregar();
			w.clicar(HomePage.BTN_BUSCAR);
		});
		
		When("clico na sacola de compras",()->{
			w.esperarPaginaCarregar();
			w.esperarElementoExistirNaTela(HomePage.LNK_SACOLA, 20);
			w.clicar(HomePage.LNK_SACOLA);
		});
		
	}

}

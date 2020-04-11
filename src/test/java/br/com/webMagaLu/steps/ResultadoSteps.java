package br.com.webMagaLu.steps;

import org.openqa.selenium.By;

import br.com.webMagaLu.action.WebInteractions;
import br.com.webMagaLu.page.ResultadoPage;
import br.com.webMagaLu.tdm.TDM;
import io.cucumber.java8.En;

public class ResultadoSteps implements En{
	public ResultadoSteps() {
		WebInteractions w = new WebInteractions();
		
		Then("clico no produto buscado",()->{
			w.esperarPaginaCarregar();
			w.esperarElementoExistirNaTela(By.xpath(ResultadoPage.XPAH_RESULT_1+TDM.produto.getNome()+ResultadoPage.XPAH_RESULT_2), 20);
			w.clicar(By.xpath(ResultadoPage.XPAH_RESULT_1+TDM.produto.getNome()+ResultadoPage.XPAH_RESULT_2));
		});
	}

}

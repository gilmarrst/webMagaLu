package br.com.webMagaLu.steps;

import br.com.webMagaLu.action.WebInteractions;
import io.cucumber.java8.En;

public class ComumSteps implements En{
	
	public ComumSteps() {
		WebInteractions w = new WebInteractions();
		
		Given("acesso o site da magazine luiza",()->{
			w.abrirUrl("https://www.magazineluiza.com.br");
		});
	}

}

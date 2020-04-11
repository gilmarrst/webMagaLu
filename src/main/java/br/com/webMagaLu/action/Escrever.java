package br.com.webMagaLu.action;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;

import br.com.webMagaLu.util.DriverContext;

public interface Escrever {
	
	default void escrever(By elemento, String texto)
	{	
		try {
			DriverContext.getDriver().findElement(elemento).clear();
			DriverContext.getDriver().findElement(elemento).sendKeys(texto);
		} catch (ElementNotInteractableException e) {
			escrever(elemento, texto);
		}
		
	}

}

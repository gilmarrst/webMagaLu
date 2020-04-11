package br.com.webMagaLu.action;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;

import br.com.webMagaLu.util.DriverContext;

public interface Clique {

	default void clicar(By elemento)
	{
		try {
			DriverContext.getDriver().findElement(elemento).click();
		} catch (ElementClickInterceptedException e) {
			clicar(elemento);
		}
		
	}
}

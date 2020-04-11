package br.com.webMagaLu.action;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import br.com.webMagaLu.util.DriverContext;

public interface Utils {
	
	
	default String getTexto(By elemento)
	{
		return DriverContext.getDriver().findElement(elemento).getText();
	}

	
	default void fecharInvite() {
		try {
			WebInteractions w = new WebInteractions();

			By DIV_INVITE = By.id("acsMainInvite");
			By BTN_CLOSE = By.id("acsFocusFirst");

			if (w.validarSeElementoExiste(DIV_INVITE)) {
				w.clicar(BTN_CLOSE);
			}

		} catch (NoSuchElementException e) {
			
		}
	}
}

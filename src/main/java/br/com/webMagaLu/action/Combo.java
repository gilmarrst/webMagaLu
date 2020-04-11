package br.com.webMagaLu.action;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import br.com.webMagaLu.util.DriverContext;

public interface Combo {
	
	default void selecionarByVisibleText(By elemento,String texto)
	{
		Select sel = new Select(DriverContext.getDriver().findElement(elemento));
		sel.selectByVisibleText(texto);
	}

}

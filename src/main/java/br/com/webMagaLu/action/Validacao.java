package br.com.webMagaLu.action;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;

import br.com.webMagaLu.util.DriverContext;

public interface Validacao {

	default void validarTextoContido(By elemento, String texto)
	{
		assertTrue(DriverContext.getDriver().findElement(elemento).getText().contains(texto));
	}
	
	default void validarTexto(By elemento,String texto)
	{
		assertTrue(DriverContext.getDriver().findElement(elemento).getText().equals(texto));
	}
	
	default Boolean validarSeElementoExiste(By elemento)
	{
		try {
			DriverContext.getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			DriverContext.getDriver().findElement(elemento);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}
}

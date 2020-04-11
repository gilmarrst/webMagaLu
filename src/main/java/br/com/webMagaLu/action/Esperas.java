package br.com.webMagaLu.action;

import static org.junit.Assert.fail;

import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.com.webMagaLu.util.DriverContext;

public interface Esperas {
	default void esperarElementoExistirNaTela(By elemento, int timeoOut) {
		try {
			if (timeoOut <= 0) {
				fail("O elemento: " + elemento + " não está presente. Time out!");
			}

			while (timeoOut > 0) {
				DriverContext.getDriver().findElement(elemento);
				break;
			}

		} catch (NoSuchElementException e) {
			esperarElementoExistirNaTela(elemento, --timeoOut);
		}
	}

	default void esperarPaginaCarregar() {
		WebInteractions w =  new WebInteractions();
		Wait<WebDriver> wait = new WebDriverWait(DriverContext.getDriver(), 60);
		wait.until(new Function<WebDriver, Boolean>() {
			public Boolean apply(WebDriver driver) {
				return String.valueOf(((JavascriptExecutor) driver).executeScript("return document.readyState"))
						.equals("complete");
			}
		});
		w.fecharInvite();
		
	}


}

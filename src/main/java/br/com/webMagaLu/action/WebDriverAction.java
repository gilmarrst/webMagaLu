package br.com.webMagaLu.action;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import br.com.webMagaLu.util.DriverContext;


public interface WebDriverAction {

	default void abrirUrl(String url) {
		WebDriver driver = DriverContext.getDriver();
		if (driver == null) {
			switch (System.getProperty("navegador")) {
			case "chrome":
				System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
				driver = new ChromeDriver();
				break;

			case "firefox":
				System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				break;
			default:
				Assert.fail("Navegador inválido!");
				break;
			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get(url);
			DriverContext.setDriver(driver);
		} else {
			driver.get(url);
			DriverContext.setDriver(driver);
		}
	}

}

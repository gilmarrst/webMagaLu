package br.com.webMagaLu.page;

import org.openqa.selenium.By;

public class ProdutoPage {

	public static By SEL_CAPACIDADE = By.id("variation-label");

	public static By BTN_ADCIONAR_SACOLA = By
			.xpath("//div[contains(@class,'wrapper-product__informations')]//button[contains(@class,'button__buy')]");
	public static By BTN_CEP_OK = By.xpath("//button[text()='Ok']");

	public static By TXT_CEP = By.name("zipcode");

	public static By LBL_PRECO = By.xpath("//span[@class='price-template__text']");
	public static By LBL_ENDERECO = By.xpath("//p[contains(@class,'js-freight-address')]");
	public static By LBL_CEP_ERRO = By.xpath("//div[@class='unavailable__text-consult--red']");

}

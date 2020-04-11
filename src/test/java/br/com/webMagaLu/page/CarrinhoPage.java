package br.com.webMagaLu.page;

import org.openqa.selenium.By;

public class CarrinhoPage {
	
	public static By LBL_TITULO_PRODUTO = By.xpath("//a[@class='BasketItemProduct-info-title']");
	public static By LBL_PRECO = By.xpath("//div[@class='BasketItemProduct-price']");
	public static By LBL_CEP = By.xpath("//span[@class='BasketAddress-zipcode']");
	public static By LBL_ENDERECO = By.xpath("//div[@class='BasketAddress-address-secondLine']");
	
	public static By SEL_QUANTIDADE = By.xpath("//select[@class='BasketItemProduct-quantity-dropdown']");
	
	public static By TXT_CEP = By.id("ZipcodeForm-input");
	
	public static By BTN_OK_CEP = By.xpath("//button[@class='buttonWithin']");

}

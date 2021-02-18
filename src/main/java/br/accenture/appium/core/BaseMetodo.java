package br.accenture.appium.core;

import static br.accenture.appium.core.DriverFactoryMobile.getDriver;

import org.openqa.selenium.By;

import io.appium.java_client.MobileBy;

public class BaseMetodo {
	
	public static void escrever(By by, String texto) {
		getDriver().findElement(by).sendKeys(texto);
	}
	
	public static By texto(String texto) {
		return By.xpath("//*[@text='"+ texto +"']");
	}
	
	public static String obterTexto(By by) {
		return getDriver().findElement(by).getText();
	}
	
	public static void clicarTexto(String texto) {
		click(texto(texto));
	}
	
	public static void click(By by) {
		getDriver().findElement(by).click();
	}
	
	public static void selecionarCombo(By by, String texto) {
		getDriver().findElement(by).click();
		clicarTexto(texto);
	}
	
	public static boolean isCheckMarcado(By by) {
		return getDriver().findElement(by).getAttribute("checked").equals("true");
	}
	
	public static By id(String nome) {
		return MobileBy.AccessibilityId(nome);
	}
	
	public static By classe(String nome) {
		return MobileBy.className(nome);
	}

}

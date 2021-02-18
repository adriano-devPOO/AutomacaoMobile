package br.accenture.appium.core;

import static br.accenture.appium.core.DriverFactoryMobile.getDriver;

import org.junit.After;

import io.cucumber.java.pt.Dado;

public class MobileLogin {

	@After
	public void fecharAplicacao() {
		DriverFactoryMobile.killDriver();
	}

	@Dado("que acesso o aplicativo")
	public void queAcessoOAplicativo() {
		try {
			getDriver();
		} catch (Exception e) {
			System.err.println("Driver não foi iniciado! " + e);
		}
	}

}

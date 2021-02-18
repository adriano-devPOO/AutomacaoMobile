package br.accenture.appium.action;

import org.openqa.selenium.By;

import br.accenture.appium.core.BaseMetodo;
import br.accenture.appium.page.FormularioPage;
import io.appium.java_client.MobileBy;

public class FormularioAction extends FormularioPage{
	
	public static void escreverNome(String nome) {
		By idNome = BaseMetodo.id("nome");
		BaseMetodo.escrever(idNome, nome);
	}
	
	public static String checarNome() {
		By idNome = BaseMetodo.id("nome");
		return BaseMetodo.obterTexto(idNome);
	}
	
	public static void selecionarCombo(String nome) {
		By combo = BaseMetodo.id("console");
		BaseMetodo.selecionarCombo(combo, nome);
	}
	
	public static String checarCombo() {
		return BaseMetodo.obterTexto(MobileBy.xpath("//android.widget.Spinner/android.widget.TextView"));
	}
	
	public static void clicarCheckBox() {
		By checkBox = BaseMetodo.classe("android.widget.CheckBox");
		BaseMetodo.click(checkBox);
	}
	
	public static void clicarSwitch() {
		By switc = BaseMetodo.id("switch");
		BaseMetodo.click(switc);
	}
	
	public static boolean checkBoxMarcado() {
		By checkBox = BaseMetodo.classe("android.widget.CheckBox");
		return BaseMetodo.isCheckMarcado(checkBox);
	}
	
	public static boolean switchMarcado() {
		By switc = BaseMetodo.id("switch");
		return BaseMetodo.isCheckMarcado(switc);
	}
	
	public static void salvar() {
		BaseMetodo.clicarTexto("SALVAR");
	}
	
	public static String obterNomeCadastrado() {
		return BaseMetodo.obterTexto(BaseMetodo.texto("Nome: Adriano"));
	}
	
	public static String obterConsoleCadastrado() {
		return BaseMetodo.obterTexto(BaseMetodo.texto("Console: switch"));
	}
	
	public static String obterCheckBoxMarcado() {
		return BaseMetodo.obterTexto(BaseMetodo.texto("Checkbox: Marcado"));
	}
	
	public static String obterSwitchOff() {
		return BaseMetodo.obterTexto(BaseMetodo.texto("Switch: Off"));
	}
	
	

}

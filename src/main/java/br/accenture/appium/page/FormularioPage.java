package br.accenture.appium.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import io.appium.java_client.MobileElement;

public class FormularioPage {

	//Nome	
	@FindBy(how= How.ID, using= "nome")
	protected static WebElement inserirNome;
	
	//Combo
	@FindBy(how = How.ID, using = "console")
	protected static WebElement selecionarConsole;
	
	//Checkbox
	@FindBy(how = How.CLASS_NAME, using = "android.widget.CheckBox")
	protected static MobileElement clickCheckBox;
	
	//Switch
	@FindBy(how = How.ID, using = "switch")
	protected static WebElement clickSwitch;
	
	//Salvar
	@FindBy(how = How.XPATH, using = "//*[@text='SALVAR')]")
	protected static MobileElement salvar;
	
	//Checar nome
	@FindBy(how = How.XPATH, using = "//*[@text='Nome: Adriano')]")
	protected static MobileElement checarNome;
	
	//Checar console
	@FindBy(how = How.XPATH, using = "//*[@text='Console: switch')]")
	protected static MobileElement checarConsole;
	
	//Checar Checkbox
	@FindBy(how = How.XPATH, using = "//*[@text='Checkbox: Marcado')]")
	protected static MobileElement checarCheckbox;
	
	//Checar Switch:
	@FindBy(how = How.XPATH, using = "//*[@text='Switch: Off')]")
	protected static MobileElement checarSwitch;
}

package br.accenture.appium.steps_definitions;

import static org.junit.Assert.assertEquals;

import br.accenture.appium.action.FormularioAction;
import br.accenture.appium.page.MenuPage;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class FormularioStepsDefinitions extends FormularioAction{

	private MenuPage menu = new MenuPage();

	@Quando("clico no formulario")
	public void clicoNoFormulario() {
		try {
			menu.acessarFormulario();
		} catch (Exception e) {
			System.err.println("Formulário não foi acessado. " + e);
		}
	}

	@Quando("valido o layout")
	public void validoOLayout() {
		try {

			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	@Quando("insiro um nome")
	public void insiroUmNome() {
		try {
			FormularioAction.escreverNome("Adriano");
		} catch (Exception e) {
			System.err.println("Nome não foi inserido. " + e);
		}
	}

	@Quando("seleciono o combo")
	public void selecionoOCombo() {
		try {
			FormularioAction.selecionarCombo("Nintendo Switch");
		} catch (Exception e) {
			System.err.println("Combo não foi selecionado. " + e);
		}
	}

	@Quando("clico no checkbox")
	public void clicoNoCheckbox() {
		try {
			FormularioAction.clicarCheckBox();
		} catch (Exception e) {
			System.err.println("CheckBox não foi selecionado. " + e);
		}
	}

	@Quando("clico no switch")
	public void clicoNoSwitch() {
		try {
			FormularioAction.clicarSwitch();
		} catch (Exception e) {
			System.err.println("Switch não foi selecionado. " + e);
		}
	}

	@Quando("clico em salvar")
	public void clicoEmSalvar() {
		try {
			FormularioAction.salvar();
		} catch (Exception e) {
			System.err.println("Salvar não foi selecionado. " + e);
		}
	}

	@Entao("valido o resultado")
	public void validoOResultado() {
		try {
			assertEquals("Nome: Adriano", FormularioAction.obterNomeCadastrado());
			assertEquals("Console: switch", FormularioAction.obterConsoleCadastrado());
			assertEquals("Checkbox: Marcado", FormularioAction.obterCheckBoxMarcado());
			assertEquals("Switch: Off", FormularioAction.obterSwitchOff());
		} catch (Exception e) {
			System.err.println("Erro na validação dos resultados. " + e);
		}
	}

}

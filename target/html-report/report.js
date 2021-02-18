$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Mobile.feature");
formatter.feature({
  "name": "Automacao Mobile",
  "description": "\tEu, como estudande da automacao mobile\n\t\tdesejo realizar uma navegacao no aplicativo TApp",
  "keyword": "Funcionalidade",
  "tags": [
    {
      "name": "@MobileFeature"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Contexto"
});
formatter.step({
  "name": "que acesso o aplicativo",
  "keyword": "Dado "
});
formatter.match({
  "location": "MobileLogin.queAcessoOAplicativo()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "CY0001 Faco um cadastro no formulario",
  "description": "",
  "keyword": "Cenario",
  "tags": [
    {
      "name": "@MobileFeature"
    },
    {
      "name": "@CY0001"
    }
  ]
});
formatter.step({
  "name": "clico no formulario",
  "keyword": "Quando "
});
formatter.match({
  "location": "FormularioStepsDefinitions.clicoNoFormulario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido o layout",
  "keyword": "E "
});
formatter.match({
  "location": "FormularioStepsDefinitions.validoOLayout()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "insiro um nome",
  "keyword": "E "
});
formatter.match({
  "location": "FormularioStepsDefinitions.insiroUmNome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono o combo",
  "keyword": "E "
});
formatter.match({
  "location": "FormularioStepsDefinitions.selecionoOCombo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no checkbox",
  "keyword": "E "
});
formatter.match({
  "location": "FormularioStepsDefinitions.clicoNoCheckbox()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico no switch",
  "keyword": "E "
});
formatter.match({
  "location": "FormularioStepsDefinitions.clicoNoSwitch()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clico em salvar",
  "keyword": "E "
});
formatter.match({
  "location": "FormularioStepsDefinitions.clicoEmSalvar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "valido o resultado",
  "keyword": "Entao "
});
formatter.match({
  "location": "FormularioStepsDefinitions.validoOResultado()"
});
formatter.result({
  "status": "passed"
});
});
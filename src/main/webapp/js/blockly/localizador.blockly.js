window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Localizador = window.blockly.js.blockly.Localizador || {};

/**
 * localizador
 */
window.blockly.js.blockly.Localizador.Executar = function() {

  this.cronapi.screen.notify('success','ok');
  this.cronapi.util.executeJavascriptNoReturn('document.getElementById(\"myFrame\").addEventListener(\"load\", myFunction);\n\nfunction myFunction() {\n  document.getElementById(\"demo\").innerHTML = \"Iframe is loaded.\";\n}');
}

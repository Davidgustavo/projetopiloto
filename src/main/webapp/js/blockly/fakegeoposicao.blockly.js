window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Fakegeoposicao = window.blockly.js.blockly.Fakegeoposicao || {};

/**
 * fakegeoposicao
 */
window.blockly.js.blockly.Fakegeoposicao.Executar = function() {

  this.cronapi.screen.changeValueOfField("vars.latitude", '-12.8359504');
  this.cronapi.screen.changeValueOfField("vars.logitude", '-38.279418');
}

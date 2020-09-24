window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ObterCoordenada = window.blockly.js.blockly.ObterCoordenada || {};

/**
 * obterCoordenada
 */
window.blockly.js.blockly.ObterCoordenada.obterCoordenada = function() {
 var item, coordenada, lista;
  item = this.cronapi.util.createPromise();
  coordenada = this.cronapi.util.executeJavascriptReturn('this.blockly.GeolocalizacaoHighCode.GeolocalizacaoHighCode()');
  console.log(coordenada);
  this.cronapi.util.handleValueToPromise('resolve', item, coordenada);
  console.log(item);
}

window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ObterCoordenada = window.blockly.js.blockly.ObterCoordenada || {};

/**
 * obterCoordenada
 */
window.blockly.js.blockly.ObterCoordenada.obterCoordenada = function() {
 var coordenada, promessa, lista, item, latitude;
  coordenada = this.cronapi.util.executeJavascriptReturn('this.blockly.GeolocalizacaoHighCode.GeolocalizacaoHighCode()');
  console.log(coordenada);
}

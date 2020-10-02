window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ObterValorCampo = window.blockly.js.blockly.ObterValorCampo || {};

/**
 * ObterValorCampo
 */
window.blockly.js.blockly.ObterValorCampo.Executar = function(id_person) {
 var item, latitude, lista, longitude, somadata, x;
  latitude = this.cronapi.util.executeJavascriptReturn('$(\'#fname\').text()');
  console.log(latitude);
  longitude = this.cronapi.util.executeJavascriptReturn('$(\'#fname2\').text()');
  console.log(longitude);
  this.cronapi.util.callServerBlocklyAsynchronous('blockly.Geoposicao:Executar', function(sender_item) {
      item = sender_item;
    this.cronapi.screen.notify('success',item);
  }.bind(this), latitude, longitude, id_person);
}

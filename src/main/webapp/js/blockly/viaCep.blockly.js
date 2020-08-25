window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.ViaCep = window.blockly.js.blockly.ViaCep || {};

/**
 * viaCep
 */
window.blockly.js.blockly.ViaCep.Executar = function() {
 var item, estado, json, cidade, bairro, logradouro;
  this.cronapi.util.getURLFromOthers('GET', 'application/json', ['https://viacep.com.br/ws/',this.cronapi.screen.getValueOfField("User.active.cep"),'/json/'].join(''), null, null, function(sender_json) {
      json = sender_json;
    logradouro = this.cronapi.json.getProperty(json, 'logradouro');
    this.cronapi.screen.changeValueOfField("User.active.logradouro", logradouro);
    bairro = this.cronapi.json.getProperty(json, 'bairro');
    this.cronapi.screen.changeValueOfField("User.active.bairro", bairro);
    cidade = this.cronapi.json.getProperty(json, 'localidade');
    this.cronapi.screen.changeValueOfField("User.active.cidade", cidade);
    estado = this.cronapi.json.getProperty(json, 'uf');
    this.cronapi.screen.changeValueOfField("User.active.estado", estado);
  }.bind(this), function(sender_item) {
      item = sender_item;
    this.cronapi.screen.notify('error','digitou o CEP errado');
  }.bind(this));
}

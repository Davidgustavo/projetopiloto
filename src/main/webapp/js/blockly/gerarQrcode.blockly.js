window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.GerarQrcode = window.blockly.js.blockly.GerarQrcode || {};

/**
 * gerarQrcode
 */
window.blockly.js.blockly.GerarQrcode.Executar = function() {
 var login_usuario;
  login_usuario = this.cronapi.screen.getValueOfField("vars.input6916");
  this.cronapi.screen.changeValueOfField("vars.QR2084", String('https://app-9-187-15130.ide.cronapp.io/#/public/teste?id=') + String(login_usuario));
}

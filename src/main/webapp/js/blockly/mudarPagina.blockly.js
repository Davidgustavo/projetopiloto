window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.MudarPagina = window.blockly.js.blockly.MudarPagina || {};

/**
 * mudarPagina
 */
window.blockly.js.blockly.MudarPagina.Executar = function() {

  this.cronapi.screen.changeView("#/home/logged/teste",[ { id : 'teste@gmail.com' } ]);
}

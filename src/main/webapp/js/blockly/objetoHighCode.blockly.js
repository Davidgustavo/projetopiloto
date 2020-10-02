(function() {
  'use strict';

  this.blockly = this.blockly || {};

  this.blockly.objetoHighCode = this.blockly.objetoHighCode || {};
  
  /**
   * @type blockly
   */
  this.blockly.objetoHighCode.objetoHighCode = function() {
    var person = {
  firstName: "John",
  lastName: "Doe",
  age: 50,
  eyeColor: "blue"
};
    return person;
  };
  

}).bind(window)();
(function() {
  'use strict';

  this.blockly = this.blockly || {};

  this.blockly.GeolocalizacaoHighCode = this.blockly.GeolocalizacaoHighCode || {};
  
  /**
   * @type blockly
   */
  this.blockly.GeolocalizacaoHighCode.GeolocalizacaoHighCode = function () {
  var x = document.getElementById("fname");
  var y = document.getElementById("fname2");

    // var coordenada = {};   
    // var myString = JSON.stringify(coordenada);
    if (navigator.geolocation) {
    navigator.geolocation.getCurrentPosition(showPosition);
  } else { 
    x.innerHTML = "Geolocation is not supported by this browser.";
  } 

  function showPosition(position) { 

  x.innerHTML = position.coords.latitude ;
  y.innerHTML = position.coords.longitude;

// coordenada.latitude = position.coords.latitude;
// coordenada.longitude = position.coords.longitude;

}  
  return coordenada;
  };

}).bind(window)();
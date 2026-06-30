var input = require('fs').readFileSync('inputruntimenodejs.txt', 'utf8');
var lines = input.split('\n');

let dist_Total = parseInt (lines.shift());
let total_Gas = parseFloat (lines.shift());

const consumo_Medio = (dist_Total / total_Gas);

console.log (`${consumo_Medio.toFixed(3)} km/l`);
var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let valor1 = parseInt (lines.shift())
let valor2 = parseInt (lines.shift())

let X = valor1+valor2

console.log (`X = ${X}`);
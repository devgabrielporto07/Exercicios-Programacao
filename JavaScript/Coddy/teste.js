var input = require('fs').readFileSync('stdin', 'utf-8'); // Note que mudamos de '/dev/stdin' para apenas 'stdin'
var lines = input.split('\n');

let A = parseInt(lines.shift()); 
let B = parseInt(lines.shift()); 

let SOMA = A + B;

console.log("SOMA = " + SOMA);
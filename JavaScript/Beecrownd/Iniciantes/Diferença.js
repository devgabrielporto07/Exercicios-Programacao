var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let valor_1 = parseInt(lines.shift())
let valor_2 = parseInt(lines.shift())
let valor_3 = parseInt(lines.shift())
let valor_4 = parseInt(lines.shift())

let diferenca_Valores = (valor_1*valor_2) - (valor_3*valor_4)

console.log (`DIFERENCA = ${diferenca_Valores}`);
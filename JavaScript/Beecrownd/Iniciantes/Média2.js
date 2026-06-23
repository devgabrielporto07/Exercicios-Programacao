var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let nota_1 = parseFloat(lines.shift())
let nota_2 = parseFloat(lines.shift())
let nota_3 = parseFloat(lines.shift())

const peso_nota_1 = 2;
const peso_nota_2 = 3;
const peso_nota_3 = 5;
const soma_Pesos = peso_nota_1 + peso_nota_2 + peso_nota_3

let media_Total = ((nota_1*peso_nota_1) + (nota_2*peso_nota_2) + (nota_3*peso_nota_3)) / (soma_Pesos)

console.log (`MEDIA = ${media_Total.toFixed(1)}`);
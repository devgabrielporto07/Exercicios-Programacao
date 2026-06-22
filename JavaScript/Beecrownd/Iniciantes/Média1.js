var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let valor1 = parseFloat(lines.shift())
let valor2 = parseFloat(lines.shift())

// Métodos camelCase ou snake_case
// Vou definir como const porque vamos acreditar que os pesos não muda
// o Const passa mais segurança na tipagem já que o JavaScript é Fracamente tipado
// Definir pesos e variaveis assim acredito que fique mais legível do que eu só jogar um valor 3.5 e multiplicar ele
const peso_Valor1 = 3.5
const peso_Valor2 = 7.5
const soma_Peso = peso_Valor1 + peso_Valor2
let media_Nota = ((valor1*peso_Valor1) + (valor2*peso_Valor2)) / (soma_Peso)

console.log (`MEDIA = ${media_Nota.toFixed(5)}`);
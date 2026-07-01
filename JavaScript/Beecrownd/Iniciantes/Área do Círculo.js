var input = require('fs').readFileSync('inputruntimenodejs.txt', 'utf8');
var lines = input.split('\n');

let n = 3.14159

let raio =  parseFloat (lines.shift())

let area_Circulo = n*(raio**2) // ou let area_Circulo = n*(raio*raio) 

console.log (`A=${area_Circulo.toFixed(4)}`); // para colocar casas decimais formatar desse jeito usamos (nome da variavel).toFixed()
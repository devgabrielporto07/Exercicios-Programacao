var input = require('fs').readFileSync('inputruntimenodejs.txt', 'utf8');
var lines = input.split('\n');

let tempo_Horas = parseInt(lines.shift());
let velocidade_Media = parseInt(lines.shift());
const consumo_Medio = 12; // Consumo  12Km / L => mesma unidade conversão direta
// todos estão na mesma unidade 
// tempo => Horas velocidade = Km/h entao a conversão é direta

const consumo_Litros = (tempo_Horas*velocidade_Media) / consumo_Medio;

console.log (`${consumo_Litros.toFixed(3)}`);
var input = require('fs').readFileSync('inputruntimenodejs.txt', 'utf8');
var lines = input.split('\n');

let distancia_Car = parseInt(lines.shift());

// 1 km a cada 2 minutos o carro y anda 30km/h a mais
// 1hora carro y se distancia do carro x => 30km
// pela as entradas o tempo que o usuário digitar vai ser dobrado por 2

const tempo_Minutos = distancia_Car*2;

console.log (`${tempo_Minutos} minutos`);
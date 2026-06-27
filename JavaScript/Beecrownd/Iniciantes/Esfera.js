var input = require('fs').readFileSync('inputruntimenodejs', 'utf8');
var lines = input.split('\n');

let raio_Esfera = parseFloat(lines.shift());
const valor_Pi = 3.14159;

let valor_Volume = (4/3)*(valor_Pi)*(raio_Esfera**3);

console.log(`VOLUME = ${valor_Volume.toFixed(3)}`);
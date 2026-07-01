var input = require('fs').readFileSync('inputruntimenodejs.txt', 'utf8'); // Entrada
var lines = input.split('\n'); // Array

const linha1 = lines.shift();
const linha2 = lines.shift();
if (!linha1) return;
if (!linha2) return;

const [valor1, valor2] = linha1.split(/\s+/);
const [valor3, valor4] = linha2.split(/\s+/);

let x_Um = parseFloat(valor1);
let x_Dois = parseFloat(valor3);
let y_Um = parseFloat(valor2);
let y_Dois = parseFloat(valor4);

// const distancia_Doispontos = ((x2 - x1)**2 + (y2 - y1))**(1/2); 
const dist_Doispontos = Math.sqrt(Math.pow(x_Dois - x_Um, 2) + Math.pow(y_Dois - y_Um, 2));

console.log(`${dist_Doispontos.toFixed(4)}`);
var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

// Pega a primeira linha válida e remove espaços extras
const linha1 = lines.shift(); 
if (!linha1) return; // Evita Runtime Error se a linha estiver vazia

const [valor1, valor2, valor3] = linha1.trim().split(/\s+/);

let lado_A = parseFloat(valor1);
let lado_B = parseFloat(valor2);
let lado_C = parseFloat(valor3);

const valor_Pi = 3.14159;

let area_Retangulo = lado_A*lado_B;
let area_Circulo = valor_Pi*(lado_C*lado_C);
let area_Trapezio = (lado_A + lado_B)*lado_C / 2;
let area_Quadrado = lado_B*lado_B;
let area_TrianguloRetangulo = lado_A*lado_C / 2;

console.log (`TRIANGULO: ${area_TrianguloRetangulo.toFixed(3)}`);
console.log (`CIRCULO: ${area_Circulo.toFixed(3)}`);
console.log (`TRAPEZIO: ${area_Trapezio.toFixed(3)}`);
console.log (`QUADRADO: ${area_Quadrado.toFixed(3)}`);
console.log (`RETANGULO: ${area_Retangulo.toFixed(3)}`);
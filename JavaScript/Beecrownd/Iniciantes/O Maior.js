var input = require('fs').readFileSync('inputruntimenodejs.txt', 'utf8');
var lines = input.split('\n');

const linha1 = lines.shift();
if (!linha1) return;

const [input_One, input_Two, input_Three] = linha1.split(/\s+/);

let value_First = parseInt(input_One);
let value_Second = parseInt(input_Two);
let value_Three = parseInt(input_Three);
// vamos considerar:
// A => value_First, B = value_Second, C = value_Three
// Biblioteca math built in do JavaScript
const maior_AB = (value_First + value_Second + Math.abs(value_First - value_Second)) / 2;
const maior_C = (maior_AB + value_Three + Math.abs(maior_AB - value_Three)) / 2;

console.log (`${maior_C} eh o maior`);
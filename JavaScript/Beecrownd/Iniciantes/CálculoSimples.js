// desempacotamento (unpacking) o problema aborda linhas de lado
// destructuring assignment (desestruturação) desempacotar um array(estrutura de dados) e criar várias variáveis

// var input = require('fs').readFileSync('/dev/stdin', 'utf8'); // caminho Para Linux
var input = require('fs').readFileSync('inputruntimenodejs.txt', 'utf8'); // caminho Para Windows meu caso
var lines = input.split('\n'); // array das linhas

// estamos recebendo valores em string se lembre**
const linha1 = lines.shift().trim(); // variavel linha 
const linha2 = lines.shift().trim();

const [codigo1, quantidade1, valor1] = linha1.split(/\s+/); // separas as strings toda vez que ver um espaço
const [codigo2, quantidade2, valor2] = linha2.split(/\s+/);
// outro método => linha.split(/\s+/) ou split(" ")

const codigo_Peca1 = parseInt(codigo1);
const quantidade_Peca1 = parseInt(quantidade1);
const valor_Peca1 = parseFloat(valor1);

const codigo_Peca2 = parseInt(codigo2);
const quantidade_Peca2 = parseInt(quantidade2);
const valor_Peca2 = parseFloat(valor2);

let total_Peca1 = quantidade_Peca1*valor_Peca1;
let total_Peca2 = quantidade_Peca2*valor_Peca2;
let valor_Apagar = total_Peca1 + total_Peca2;
console.log(`VALOR A PAGAR: R$ ${valor_Apagar.toFixed(2)}`);

// Ideia:

// lines
// │
// ├── "12 1 5.30"
// └── "16 2 5.10"

//         │
//         ▼
// linha1 = "12 1 5.30"

//         │
//         ▼
// split(" ")

//         │
//         ▼
// ["12","1","5.30"]

//         │
//         ▼
// codigo1
// quantidade1
// valor1
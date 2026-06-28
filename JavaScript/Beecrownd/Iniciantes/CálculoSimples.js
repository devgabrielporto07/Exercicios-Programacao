// desempacotamento (unpacking) o problema aborda linhas de lado
// destructuring assignment (desestruturação) desempacotar um array(estrutura de dados) e criar várias variáveis

// var input = require('fs').readFileSync('/dev/stdin', 'utf8'); // caminho Para Linux
var input = require('fs').readFileSync('inputruntimenodejs.txt', 'utf8'); // caminho Para Windows meu caso
// Obs => o arquivo inputruntimenodejs.txt é um arquivo de teste para rodar na minha máquina local e eu consgeuir ver os resutlados.
var lines = input.split('\n'); // array das linhas

// estamos recebendo valores em string se lembre**
const linha1 = lines.shift(); // variavel linha 
const linha2 = lines.shift();
if (!linha1) return;
if (!linha2) return;

const [codigo1, quantidade1, valor1] = linha1.split(/\s+/); // separas as strings toda vez que ver um espaço
const [codigo2, quantidade2, valor2] = linha2.split(/\s+/);
// outro método => linha.split(/\s+/) ou split(" ")

let codigo_Peca1 = parseInt(codigo1);
let quantidade_Peca1 = parseInt(quantidade1);
let valor_Peca1 = parseFloat(valor1);

let codigo_Peca2 = parseInt(codigo2);
let quantidade_Peca2 = parseInt(quantidade2);
let valor_Peca2 = parseFloat(valor2);

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
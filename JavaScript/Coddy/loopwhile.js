// Escreva um programa que recebe uma entrada, um número float
// Use um loop While para dividir por 2 enquanto o número for maior ou igual a 3.5
// Imprima o primeiro número que seja maior que 3.5
const inp = ["100.00", "15.00", "2"]; // array
let number = parserFloat(inp)
while (number >= 3.5) {
    number /= 2
}
console.log (number)
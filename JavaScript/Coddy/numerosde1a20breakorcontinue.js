// Escreva um programa que imprima os números de 1 a 20. Sua tarefa é pular a impressão de números que são múltiplos de 4 usando a instrução continue.

for (let number = 1; number <=20; number++) {
    if (number % 4 === 0) {
        continue;
    }
    console.log (number);
}

// posso definir uma variavel dentro do for ou somar também
// const não pode variar por isso let para ter mais segurança e não converter o tipo direto usa o === (igualdade estrita) (boa prática)
// == (Igualdade Solta/Abstrata): Ele converte os tipos dos valores antes de comparar. Se você comparar 1 (número) com "1" (string), ele vai retornar true porque o valor é o mesmo.


let contador = 0
while (contador <= 20) {
    contador += 1
    if (contador % 4 === 0) {
        continue;
    }
    console.log (contador)
}
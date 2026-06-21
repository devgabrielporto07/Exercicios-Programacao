const inp = 8
let n = parseInt(inp); 

let fatorial = 1 
for (let i = 1; i <= n; i++) { // definir uma variavel dentro do for mas é uma variável local
	fatorial *= i
}
console.log(fatorial);
// console.log(i);
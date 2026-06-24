var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let number_Employee = parseInt(lines.shift())
let horas_Work = parseInt(lines.shift())
let valor_Hora = parseFloat(lines.shift())

let salario_Employee = (horas_Work*valor_Hora)

console.log (`NUMBER = ${number_Employee}`);
console.log (`SALARY = U$ ${salario_Employee.toFixed(2)}`);
var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');

let nome_Vendedor = (lines.shift())
let salario_Fixo = parseFloat(lines.shift())
let total_Vendas = parseFloat(lines.shift())
const comissao_Taxa = 0.15 // 15% 15/100 => 0.15
let salario_Comissao = (total_Vendas*comissao_Taxa) + salario_Fixo // total das vendas multiplicado pela a comissão

console.log (`TOTAL = R$ ${salario_Comissao.toFixed(2)}`);

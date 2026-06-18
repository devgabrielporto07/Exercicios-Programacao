
// Lê toda a entrada enviada pelo Beecrowd
var input = require('fs').readFileSync('/dev/stdin', 'utf8');

// Quebra a entrada em um array usando cada quebra de linha
var lines = input.split('\n');

// shift() remove e retorna o primeiro elemento do array
// parseInt() converte a string para número inteiro
// O Beecrowd envia toda a entrada do problema como um único texto.
// readFileSync lê esse texto da entrada padrão (stdin) e armazena na variável input.
// ===== LEITURA DE ENTRADA (BEECROWD) =====
// input -> texto completo enviado pelo Beecrowd
// split('\n') -> separa cada linha em uma posição do array lines
// shift() -> pega e remove a primeira linha disponível
// parseInt() -> converte texto para número inteiro
//
// Exemplo:
// Entrada:
// 30
// 10
//
// lines = ["30", "10"]
//
// A = parseInt(lines.shift()) -> 30
// B = parseInt(lines.shift()) -> 10
//
// lines agora = []
// =========================================
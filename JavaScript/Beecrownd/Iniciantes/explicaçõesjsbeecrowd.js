// 1) split('\n') → separa a entrada em linhas.
// Exemplo:
// "12 1 5.30\n16 2 5.10"
// ↓
// ["12 1 5.30", "16 2 5.10"]

// 2) Cada linha ainda é uma String.
// Para separar os valores da linha, usamos split(" ").

// 3) Depois fazemos a conversão para Number
// usando parseInt() ou parseFloat().
// const [codigo, quantidade, valor] = linha.split(" ");
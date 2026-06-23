// Write the function below
const inp = 5
function soma_Numbers () {
    let valor = 0;
    for (let valor = 1; valor <= 10000; valor++) {
        valor += 1;
    }
    console.log (valor);
}

let n = parseInt(inp); // Don't change this line

// Execute your function n times with a loop

for (let i = 0; i < n; i++) {
    soma_Numbers ();
}
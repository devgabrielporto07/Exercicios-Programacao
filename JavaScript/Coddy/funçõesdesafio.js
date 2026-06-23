function sumNumbers() {
    let res = 0;
    for (let i = 1; i <= 10000; i++) {
        res += i;
    }
    console.log(res);
}

let n = parseInt(inp); // Don't change this line

for (let i = 0; i < n; i++) {
    sumNumbers();
}
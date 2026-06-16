const inp = ["100.00", "15.00", "2"]; // array
let billAmount = parseFloat(inp[0]); // Don't change this line
let tipPercentage = parseFloat(inp[1]); // Don't change this line
let numPeople = parseInt(inp[2]); // Don't change this line

console.log ("Bill Split Calculator");
let totally = (tipPercentage / 100)*billAmount + billAmount;
console.log (`Total (including tip): $${totally}`);
let peopleTotally = totally / numPeople;
console.log (`Each person pays: $${peopleTotally}`);
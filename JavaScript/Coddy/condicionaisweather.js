const inp = ["100.00", "15.00", "2"];
let rainfall = parseInt(inp); // Don't change this line
let rainCondition = "unset";
// Type your code below

if (rainfall < 1) {
    rainCondition = "Dry";
}
else if (rainfall >= 1 && rainfall <= 10) {
    rainCondition = "Light Rain";
}
else if (rainfall >= 11 && rainfall <= 50) {
    rainCondition = "Moderate Rain";
}
else {
    rainCondition = "Heavy Rain";
}

// Don't change the line below
console.log(rainCondition);
// Error
let age = parseInt(inp[0]); // Don't change this line
let has_adult = inp[1] === "true"; // Don't change this line
// Write your code below
if  (age <=10) {
    console.log ("Sorry, you are too young")
}
if (age > 10) {
    if (age <= 13 && has_adult)
        console.log ("You can enter with adult supervision!")
    else {
        console.log ("Sorry, you need an adult with you")
    }   
}
else {
    console.log ("You can enter by yourself!")
}
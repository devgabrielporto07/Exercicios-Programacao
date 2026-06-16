let day = 3;
let dayName;

switch (day) {
    case 1:
        dayName = "Sunday";
        break;
    case 2:
        dayName = "Monday";
        break;
    case 3:
        dayName = "Tuesday";
        break;
    // ... casos para outros dias ...
    default:
        dayName = "Invalid day";
}

console.log(dayName); // Saída: Tuesday
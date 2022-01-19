let fs = require('fs');

let data = fs.readFileSync("simple.txt")

let content = data.toString();

console.log(content)
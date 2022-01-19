// let users = require('./users')
// console.log(users)

const fs = require("fs");

fs.readFile("users.json", function(err, data) {
	
	
	if (err) throw err;

	
	const users = JSON.parse(data);
	
	console.log(users); 
});

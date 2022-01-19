const fs = require("fs");

const users = require("./users");

let user = {
	name: "Praveen",
	age: 30,
	language: ["PHP", "Go", "JavaScript"]
};
users.push(user);
fs.writeFile("users.json", JSON.stringify(users), err => {
	if (err) throw err;

	console.log("Done writing");
});

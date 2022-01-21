let mysql = require('mysql')
let connection = mysql.createConnection({
  host: 'localhost',
  user: 'root',
  password: 'root',
  database: 'legato_db'
})
connection.connect(function(err) {
  if (err) throw err;
  console.log("Connected!");
});
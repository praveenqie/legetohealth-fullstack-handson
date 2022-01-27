let app = require('express')();
let port = 9090;
let bodyParser = require('body-parser');



let mysql = require('mysql');
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


app.use([bodyParser.text()],bodyParser.json());

app.get('/employee/:id',(request,response)=>{
  let connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'root',
    database: 'legato_db'
  });
    let id = parseInt(request.params.id);
    console.log(`id is ${id}`)
   
    connection.query(`select * from employee where id=${id}`,function (err, result) {
        if (err) throw err;
        console.log(result);
        response.json(result);
      });
      connection.end();
    
});

app.get('/employee',(request,response)=>{
  let connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'root',
    database: 'legato_db'
  });
    connection.query(`select * from employee`,function (err, result) {
        if (err) throw err;
        console.log(result);
        response.json(result);
        connection.end();
      });
    connection.end();
});


app.delete('/employee/:id',(request,response)=>{
    let id = parseInt(request.params.id);
    console.log(`id is ${id}`)
    connection.query(`delete from employee where id=${id}`,function (err, result) {
        if (err) throw err;
        console.log(result);
        response.json(result);
      });
});

app.post('/employee',(request,response)=>{
    console.log(request.body);
   
    let requestBody = request.body;
    
    let name = requestBody['name'];
    let salary = requestBody['salary'];
    console.log(`name = ${name} and salary = ${salary}`);
    connection.query(`INSERT INTO employee (name,salary)VALUES('${name}','${salary}')`,function (err, result) {
        if (err) throw err;
        console.log(result);
        response.json(result);
      });
    
});
app.listen(port, ()=> console.log(`listining to ${port}`));

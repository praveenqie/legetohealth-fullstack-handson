let app = require('express')();
let port = 9090;
let bodyParser = require('body-parser');
// let cors = require('cors');
// app.cors({origin: `*`});
let cors = require('cors');
app.use(cors({origin: '*'}));

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
 
    let id = parseInt(request.params.id);
    console.log(`id is ${id}`)
   
    connection.query(`select * from employee where id=${id}`,function (err, result) {
        if (err) throw err;
        console.log(result);
        response.json(result);
      });
    
    
});

app.get('/employee',(request,response)=>{
 
    connection.query(`select * from employee`,function (err, result) {
        if (err) throw err;
        console.log(result);
        response.json(result);
       
      });
   
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
        response.json('employee stored successfully');
      });
    
});

app.put('/employee',(request,response)=>{
  console.log(request.body);
 
  let requestBody = request.body;
  let id = requestBody['id'];
  let name = requestBody['name'];
  let salary = requestBody['salary'];
  console.log(`name = ${name} and salary = ${salary}`);
  //var sql = "UPDATE TABLE employee SET name =? , salary =?  WHERE employee_id = ?";
  connection.query(`UPDATE employee SET name = "${name}" , salary=${salary} WHERE id=${id}`,
  function (err, result) {
      if (err) throw err;
      console.log(result);
      response.json('employee stored successfully');
    });
  
});
app.listen(port, ()=> console.log(`listining to ${port}`));


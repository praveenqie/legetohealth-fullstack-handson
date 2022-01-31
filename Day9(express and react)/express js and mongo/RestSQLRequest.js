let app = require('express')();
let port = 9090;
let bodyParser = require('body-parser');
let cors = require('cors');
app.use(cors({ origin: '*' }));

let mysql = require('mysql');
let connection = mysql.createConnection({
    host: 'localhost',
    user: 'root',
    password: 'root',
    database: 'legato_db'
})
connection.connect(function (err) {
    if (err) throw err;
    console.log("Connected!");
});


app.use([bodyParser.text()], bodyParser.json());

app.get('/employee/:id', (request, response) => {

    let id = parseInt(request.params.id);
    console.log(`id is ${id}`)

    connection.query(`select * from employees where EmployeeID=${id}`, function (err, result) {
        if (err) throw err;
        console.log(result);
        response.json(result);
    });


});

app.get('/employee', (request, response) => {

    connection.query(`select * from employees`, function (err, result) {
        if (err) throw err;
        console.log(result);
        response.json(result);

    });

});


app.delete('/employee/:id', (request, response) => {
    let id = parseInt(request.params.id);
    console.log(`id is ${id}`)
    connection.query(`delete from employees where EmployeeID=${id}`, function (err, result) {
        if (err) throw err;
        console.log(result);
        response.json(result);
    });
});

app.post('/employee', (request, response) => {
    console.log(request.body);

    let requestBody = request.body;

    let firstName = requestBody['FirstName'];
    let lastName = requestBody['LastName'];
    let age = requestBody['Age'];
    let salary = requestBody['Salary'];
    let city = requestBody['City'];
    connection.query(`INSERT INTO employees (FirstName,LastName,Age,Salary,City)VALUES('${firstName}','${lastName}','${age}','${salary}','${city}')`, function (err, result) {
        if (err) throw err;
        console.log(result);
        response.json('employee stored successfully');
    });


});

app.put('/employee', (request, response) => {
    console.log(request.body);

    let requestBody = request.body;
    let employeeId = requestBody['EmployeeID'];
    let firstName = requestBody['FirstName'];
    let lastName = requestBody['LastName'];
    let age = requestBody['Age'];
    let salary = requestBody['Salary'];
    let city = requestBody['City'];
    
    //var sql = "UPDATE TABLE employee SET name =? , salary =?  WHERE employee_id = ?";
    connection.query(`UPDATE employees SET FirstName = "${firstName}" , LastName = "${lastName}",Age = "${age}",Salary="${salary}",City = "${city}" WHERE EmployeeID=${employeeId}`,
        function (err, result) {
            if (err) throw err;
            console.log(result);
            response.json('employee stored successfully');
        });

});
app.listen(port, () => console.log(`listining to ${port}`));


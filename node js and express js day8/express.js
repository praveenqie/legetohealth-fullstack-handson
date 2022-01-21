let app = require('express')();
let port = 9090;
app.get('/',(request,response)=> {
    response.send('Get Request form/')
});

app.listen(port, ()=> console.log(`listining to ${port}`));
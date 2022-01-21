let http = require('http');
let port = 9090;

let server = http.createServer((request,response) => {
   response.writeHead(200,{'content-type':'text/html'});
    
    response.write(`<h2>Welcome to node js world</h2>`);
    response.end();
});
server.listen(port,()=> console.log(`server just started in ${port}`))
let http = require('http');
let url = require('url');
let port = 9090;

let server = http.createServer((request,response)=>{

    if(request.url !='/favicon.ico' ){
        let urlobject = url.parse(request.url,true);
        console.log(urlobject.query.username,urlobject.query.age);
        response.writeHead(200,{'content-type':'text/html'});
        response.write(`<h2>Welcome to node js web</h2>`);
        response.end();
    }
});
server.listen(port,()=>{console.log(`server is running on port ${port}`)});
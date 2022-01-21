let app = require('express')();

let http = require('http').Server(app)

let io = require('socket.io')(http)

let port = 9090
app.get('/',(request,response)=>{
    response.sendFile(__dirname+"/client.html");

})
http.listen(9090, ()=> console.log(`listining to ${port}`));

io.on('connection',(socket)=>{
    console.log(`client is connected to server ${socket.connected}`);

    socket.on("clientmessage",(msg)=>{
        socket.emit("message key",msg);
    });


});


let MongoClient = require('mongodb').MongoClient;
let dbUrl = "mongodb://localhost:27017";
let app = require('express')();
let port = 9090;

// app.get('/employee',(request,response)=> {
//     response.send('Get Request form/')
// });

app.get('/employee/:id',(request,response)=>{
   

    let id = parseInt(request.params.id);
    console.log(`id is ${id}`)
    MongoClient.connect(dbUrl,{useNewUrlParser:true},(error,client)=>{
    if(!error){
        let mydb = client.db('mydb');
        let doc = mydb.collection("employee").find({_id:id});
        let count =0 ;
        doc.forEach((record)=>{
            count++;
            response.json(record);
        },()=>{
            if(count==0){
                response.json({error:`sorry ${id} is not found`});
            }
            client.close();
        });
    }
    });
});

app.get('/employee',(request,response)=>{

    MongoClient.connect(dbUrl,{useNewUrlParser:true},(error,client)=>{
        if(!error){
            let mydb = client.db('mydb');
            let doc = mydb.collection("employee").find({});
            let arrayRecords = [];
            let count =0;
            doc.forEach((record)=>{
                arrayRecords.push(record);
                count++;
            },()=>{
                if(count == 0){
                    response.json({error:`sorry ${id} is not found`});
                }else{
                    response.json(arrayRecords);
                }
                client.close();
            });
        }
    });

});

app.listen(port, ()=> console.log(`listining to ${port}`));



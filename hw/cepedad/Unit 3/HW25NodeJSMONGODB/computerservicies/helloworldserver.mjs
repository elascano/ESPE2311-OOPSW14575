import express from "express";
import http from "http";

const app = express();
const port = 3002;

// Usando Express
//app.get('/', (req,res)=>{
 //   res.send('<b>Welcome to Mateo\'s Web server!</b>');
//});

// Usando el módulo HTTP
const server = http.createServer((req,res)=>{
    res.statusCode = 200;
    res.setHeader('Content-Type','text/html');
    res.end('<b>Welcome to David\'s Web server!</b>  <hr>Welcome OOP</hr>');
});

server.listen(port,()=>{
    console.log(`Server is running and listening on port ${port}`);
});


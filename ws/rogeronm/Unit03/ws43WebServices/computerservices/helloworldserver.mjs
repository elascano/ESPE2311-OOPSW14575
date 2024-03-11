import express from "express";

const app = express(); //instacia --app y una constante que no cambaira
const port = 3002;

app.get(`/`, (req,res) => {
    res.send("<b>Welcome to Mateo Web Server!<b>, <hr> Programmer´s from OOP 14575");
});

app.listen(port, ()=>{
    console.log("Server is running and listening on port " + port)       //console es un objeto
})


import express from "express";

const app = express();
const port = 3002;

app.get(`/`, (req,res) => {
    res.send("<b>Welcome to Andrés Web Server!<b>, <hr> Programmer's from OOP 14575");
});

app.listen(port, ()=>{
    console.log("Server is running and listening on port " + port)
})


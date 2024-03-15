import express from "express";

const app = express();

const port = 3002;

app.get("/", (req, res) => {
     res.send("Welcome to Carlos\'s Web server!");
});

app.get('health',(req, res)=>{
    res.send('ok');
});

app.listen(port, () => {
    console.log('Server is running and listening on port ${port}');
});

export default app;

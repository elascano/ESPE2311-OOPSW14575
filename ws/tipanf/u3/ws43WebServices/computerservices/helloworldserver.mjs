import express from "express";

const app = express();
const port = 3002;

app.get('/', (req,res) => {
  res.send('Welcome to Fredeicks Web server!')  
});

app.listen(port, ()=> {
    console.log(`Server is running and listening on port ${port}`);
});

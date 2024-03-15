const express = require('express');
const app = express();

const morgan = require('morgan');

app.use(morgan('dev'));


app.get('/', (req,res) => {
    res.sendFile(__dirname + '/index.html');
})

app.listen(8080, () => {
    console.log('Server is listening on port 8080');
})
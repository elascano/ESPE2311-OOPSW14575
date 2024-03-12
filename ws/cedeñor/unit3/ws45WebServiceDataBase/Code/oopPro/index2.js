const express = require('express');
const mongoose = require('mongoose');
const morgan = require('morgan');

const app = express();

const PORT = 3000;

mongoose.connect('mongodb+srv://oop:oop@cluster0.9knxc.mongodb.net/oop?retryWrites=true&w=majority');

const db = mongoose.connection;

db.on('error', (error) => console.error(error));
db.once('open', () => console.log('Connected to Database'));

app.use(morgan('dev'));
app.use(express.json());

const customerRouter = require('./routes/customerRoute');

app.use('/computerstore', customerRouter);

app.listen(PORT, () => {
    console.log(`Server is listening on port ${PORT}`);
})

app.get('/', (req, res) => {
    res.send('Welcome to the Computer Store API');
});
const express = require('express');
const mongoose = require('mongoose');
const morgan = require('morgan');

const app = express();

const PORT = 3000;

mongoose.connect('mongodb+srv://mateo:mateo@cluster0.jp3jhno.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0', {useNewUrlParser: true});

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
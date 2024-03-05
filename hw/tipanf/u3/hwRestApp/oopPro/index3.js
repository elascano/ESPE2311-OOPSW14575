const express = require('express');
const mongoose = require('mongoose');
const morgan = require('morgan');

const app = express();

const PORT = 3000;

mongoose.connect('mongodb+srv://frederick:frederick@cluster0.gteqor0.mongodb.net/?retryWrites=true&w=majority&appName=Cluster0', {useNewUrlParser: true});

const db = mongoose.connection;

db.on('error', (error) => console.error(error));
db.once('open', () => console.log('Connected to Database'));

app.use(morgan('dev'));
app.use(express.json());

const carRouter = require('./routes/carRoute');

app.use('/carstore', carRouter);

app.listen(PORT, () => {
    console.log(`Server is listening on port ${PORT}`);
})
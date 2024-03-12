const port = 3000;
const express = require("express");
const app = express();
const mongoose = require("mongoose");

mongoose.connect(`mongodb+srv://oop:oop@cluster0.9knxc.mongodb.net/oop?retryWrites=true&w=majority`, { useNewUrlParser: true});

const db = mongoose.connection;

db.on("error", (error) => {
    console.error("MongoDB connection error:", error);
});
db.once("open", () => {
    console.log("Connected to MongoDB");
});

app.use(express.json());

const customerRouter = require('./routes/customerRoute');
app.use('/computerstore', customerRouter);

app.listen(port, () => {
    console.log("My computer store is running on port " + port);
});

const port = 3000;
const express = require("express");
const app = express();
const mongoose = require("mongoose");

mongoose.connect(`mongodb+srv://davidcepeda13:david@cluster0.fvgdrtu.mongodb.net/`, { useNewUrlParser: true});

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


const port = 3001;
const express = require("express");
const app = express();
const mongoose = require("mongoose");

mongoose.connect(`mongodb+srv://rony558:Diego_558@cluster0.8o2u5up.mongodb.net/`, { useNewUrlParser: true});

const db = mongoose.connection;

db.on("error", (error) => {
    console.error("MongoDB connection error:", error);
});
db.once("open", () => {
    console.log("Connected to MongoDB");
});

app.use(express.json());

const vehicleRouter = require('./routes/vehicleRoute');
app.use('/vehicles', vehicleRouter);

app.listen(port, () => {
    console.log("My car store is running on port " + port);
});

const port = 3006;
const express = require("express");
const app = express();
const mongoose = require("mongoose");

mongoose.connect(`mongodb+srv://gabriel2004mat:1234@cluster0.dsm2nfg.mongodb.net/`, { useNewUrlParser: true});

const db = mongoose.connection;

db.on("error", (error) => {
    console.error("MongoDB connection error:", error);
});
db.once("open", () => {
    console.log("Connected to MongoDB ");
});

app.use(express.json());

const cellphoneRouter = require('./routes/cellphoneRoute');
app.use('/computerstore', cellphoneRouter);

app.listen(port, () => {
    console.log("My computer store is running on port " + port);
});

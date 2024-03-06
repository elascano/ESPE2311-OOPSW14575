const port = 3000;
const express = require("express");
const app = express();
const mongoose = require("mongoose");

mongoose.connect(`mongodb+srv://oop:oop@cluster0.9knxc.mongodb.net/oop?retryWrites=true&w=majority`,
{ useNewUrlParser:true});

const db = mongoose.connection;

db.on("error", (error) => crossOriginIsolated.error(error));
db.once("open", () => console.log("System connected to OOP Mongo DB"));

app.use(express.json);

const customerRouter = require("./routes/customerRoute");

app.use("/computerstore", customerRouter);

app.listen(port, () => console.log("My computer store services are working on port " + port));
const port = 3000;
const express = require("express");
const app = express();
const mongoose = require("mongoose");
const morgan = require("morgan");

mongoose.connect(`mongodb+srv://materoge32:Fpztsb3yVp417t3Q@cluster0.znbumcs.mongodb.net/?retryWrites=true&w=majority`, {
  useNewUrlParser: true,
  useUnifiedTopology: true
});

const db = mongoose.connection;
db.on("error", (error) => {
  console.error(error);
});
db.once("open", () => console.log("System connected to oop Mongo"));

app.use(morgan('dev'));
app.use(express.json());

const customerRouter = require("./routes/customerRoute.js");

app.use("/computerstore", customerRouter);

app.listen(port, () => {
  console.log(`My computer store services are working on port ${port}`);
});
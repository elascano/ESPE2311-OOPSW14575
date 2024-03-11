const mongoose = require('mongoose');

const vehiclesSchema = new mongoose.Schema(
{
    id : {type : Number},
    brand: {type : String},
    rentalCost: {type : Number},    
    hourlyUse : {type : Number}
},
{collection : "Vehicles"}
);

module.exports = mongoose.model('Vehicles',vehiclesSchema);
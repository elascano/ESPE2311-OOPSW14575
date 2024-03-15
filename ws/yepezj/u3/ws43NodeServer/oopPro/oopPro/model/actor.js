const mongoose = require('mongoose');

const actorsSchema = new mongoose.Schema(
    {
        id: { type : Number},
        name : { type : String},
        hourlyWage : { type : Number},
        daysWork: { type : Number},
        totalCost: { type : Number }

    }, {
        collection: 'actors'
    }
);

module.exports = mongoose.model('Actor', actorsSchema);
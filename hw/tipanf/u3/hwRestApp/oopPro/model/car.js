const mongoose = require('mongoose');

const carSchema = new mongoose.Schema(
    {
        id: { type : Number},
        model : { type : String},
        make : { type : String}
    }, {
        collection: 'cars'
    }
);

module.exports = mongoose.model('Car', carSchema);
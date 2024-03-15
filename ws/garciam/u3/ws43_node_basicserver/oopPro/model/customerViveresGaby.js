const mongoose = require('mongoose');

const customerSchema = new mongoose.Schema(
    {
        id: { type : Number},
        cedula : { type : String},
        sellsNumber : { type : Number},
    }, {
        collection: 'viveres_gaby_software_kit_DB'
    }
);

module.exports = mongoose.model('Customers', customerSchema);

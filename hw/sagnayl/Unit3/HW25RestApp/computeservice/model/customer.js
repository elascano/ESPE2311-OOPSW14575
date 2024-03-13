const mongoose = require('mongoose');

const customerSchema = new mongoose.Schema(
    {
        id: { type : Number},
        name : { type : String},
        age : { type : Number},
        moneySpend: { type : Number}
    }, {
        collection: 'customers'
    }
);

module.exports = mongoose.model('Customer', customerSchema);
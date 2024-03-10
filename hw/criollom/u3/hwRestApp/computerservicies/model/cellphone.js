const mongoose = require('mongoose');

const cellphoneSchema = new mongoose.Schema({
    id: { type: String },
    name: { type: String },
    priceSubtotal: { type: Number },
    priceTotal: { type: Number }

}, { collection: "Cellphones" });

module.exports = mongoose.model('Cellphones',cellphoneSchema);

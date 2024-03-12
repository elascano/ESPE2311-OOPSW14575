const customers = require('../model/customer');



const router = require('express').Router();

//get all customers

 router.get('/customers' ,async (req,res) => {
    try {
        const customer = await customers.find();
        res.json(customer);
    } catch (err) {
        res.status(500).json({message: err.message});
    }

 });

module.exports = router;
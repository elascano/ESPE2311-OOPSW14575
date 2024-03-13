const actor = require('../model/actor');



const router = require('express').Router();

//get all customers

 router.get('/actors' ,async (req,res) => {
    try {
        const customer = await actor.find();
        res.json(customer);
    } catch (err) {
        res.status(500).json({message: err.message});
    }

 });

module.exports = router;
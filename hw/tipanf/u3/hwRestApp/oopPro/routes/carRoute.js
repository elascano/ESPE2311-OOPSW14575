const cars = require('../model/car');



const router = require('express').Router();

//get all cars

 router.get('/cars' ,async (req,res) => {
    try {
        const car = await cars.find();
        res.json(car);
    } catch (err) {
        res.status(500).json({message: err.message});
    }

 });

module.exports = router;
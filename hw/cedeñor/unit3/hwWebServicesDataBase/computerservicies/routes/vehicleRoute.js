const express = require("express");
const customers = require('../model/vehicles');
const router = require('express').Router();

//Get all Customers
router.get(`/vehicles`, async(req,res)=>{
    try{
        const vehicles = await vehicles.find();
        res.json(customer);
    }catch(err){
        res.status(500).json({message : err.message});
    }
});

module.exports = router;
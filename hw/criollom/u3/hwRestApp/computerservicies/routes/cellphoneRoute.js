const express = require("express");
const cellphones = require('../model/cellphone');
const router = require('express').Router();

// Get all Cellphones
router.get(`/cellphones`, async(req,res)=>{
    try{
        const cellphone = await cellphones.find();
        res.json(cellphone);
    }catch(err){
        res.status(500).json({message : err.message});
    }
});

module.exports = router;

"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var fs_1 = require("fs");
var Cat_js_1 = require("../Model/Cat.js");
var Dog_js_1 = require("../Model/Dog.js");
var Owner_js_1 = require("../Model/Owner.js");
var PetProject_js_1 = require("../PetProject.js");
var JsonHandler = /** @class */ (function () {
    function JsonHandler() {
    }
    JsonHandler.loadFromJson = function () {
        var file = fs_1.default.readFileSync(PetProject_js_1.SAVE_FILE, { encoding: 'utf-8' });
        var object = JSON.parse(file);
        var objectPets = object["pets"];
        var pets = [];
        for (var _i = 0, objectPets_1 = objectPets; _i < objectPets_1.length; _i++) {
            var objPet = objectPets_1[_i];
            if (objPet["type"] == "cat") {
                pets.push(new Cat_js_1.Cat(objPet["name"], objPet["color"], objPet["age"]));
            }
            else if (objPet["type"] == "dog") {
                pets.push(new Dog_js_1.Dog(objPet["name"], objPet["breed"], objPet["age"]));
            }
        }
        var owner = new Owner_js_1.Owner(object["firstName"], object["lastName"], object["age"]);
        owner.pets = pets;
        return owner;
    };
    JsonHandler.saveJson = function (owner) {
        var petsData = owner.pets.map(function (pet) {
            if (pet instanceof Cat_js_1.Cat) {
                return {
                    type: 'cat',
                    name: pet.name,
                    color: pet.color,
                    age: pet.age
                };
            }
            else if (pet instanceof Dog_js_1.Dog) {
                return {
                    type: 'dog',
                    name: pet.name,
                    breed: pet.breed,
                    age: pet.age
                };
            }
            return null;
        });
        var ownerData = {
            firstName: owner.firstName,
            lastName: owner.lastName,
            age: owner.age,
            pets: petsData
        };
        var jsonContent = JSON.stringify(ownerData, null, 2);
        fs_1.default.writeFileSync(PetProject_js_1.SAVE_FILE, jsonContent, { encoding: 'utf-8', flag: "w" });
    };
    return JsonHandler;
}());
exports.default = JsonHandler;

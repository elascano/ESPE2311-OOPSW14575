"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Owner = void 0;
var Dog_js_1 = require("./Dog.js");
var Owner = /** @class */ (function () {
    function Owner(firstName, lastName, age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pets = [];
    }
    Owner.prototype.addPet = function (pet) {
        this.pets.push(pet);
    };
    Owner.prototype.showPets = function () {
        console.log("".concat(this.firstName, " ").concat(this.lastName, "'s Pets:"));
        this.pets.forEach(function (pet) {
            console.log("".concat(pet instanceof Dog_js_1.Dog ? 'Dog' : 'Cat', " - Name: ").concat(pet.name, ", Age: ").concat(pet.age, ", Sound: ").concat(pet.makeSound()));
        });
    };
    Owner.prototype.feedPets = function () {
        console.log("".concat(this.firstName, " ").concat(this.lastName, " is feeding their pets."));
    };
    return Owner;
}());
exports.Owner = Owner;

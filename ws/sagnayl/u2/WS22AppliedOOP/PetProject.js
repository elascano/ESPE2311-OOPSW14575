"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
var readlineSync = require("readline-sync");
var Dog = /** @class */ (function () {
    function Dog(name, breed, age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    Dog.prototype.makeSound = function () {
        return "Woof, woof";
    };
    return Dog;
}());
var Cat = /** @class */ (function () {
    function Cat(name, color, age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    Cat.prototype.makeSound = function () {
        return "Meow, meow";
    };
    return Cat;
}());
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
            console.log("".concat(pet instanceof Dog ? 'Dog' : 'Cat', " - Name: ").concat(pet.name, ", Age: ").concat(pet.age, ", Sound: ").concat(pet.makeSound()));
        });
    };
    Owner.prototype.feedPets = function () {
        console.log("".concat(this.firstName, " ").concat(this.lastName, " is feeding their pets."));
    };
    return Owner;
}());
function promptForInput(prompt) {
    return readlineSync.question(prompt);
}
function promptForYesNo(prompt) {
    var response = readlineSync.question(prompt).toLowerCase();
    return response === 'yes';
}
function main() {
    var ownerFirstName = promptForInput("Enter owner's first name: ");
    var ownerLastName = promptForInput("Enter owner's last name: ");
    var ownerAge = parseInt(promptForInput("Enter owner's age: "));
    var owner = new Owner(ownerFirstName, ownerLastName, ownerAge);
    var addAnotherPet = true;
    while (addAnotherPet) {
        var petType = promptForInput("Enter the pet type (Dog or Cat): ");
        var petName = promptForInput("Enter pet's name: ");
        var petBreedOrColor = promptForInput("Enter pet's ".concat(petType === 'Dog' ? 'breed' : 'color', ": "));
        var petAge = parseInt(promptForInput("Enter pet's age: "));
        if (petType.toLowerCase() === 'dog') {
            var dog = new Dog(petName, petBreedOrColor, petAge);
            owner.addPet(dog);
        }
        else if (petType.toLowerCase() === 'cat') {
            var cat = new Cat(petName, petBreedOrColor, petAge);
            owner.addPet(cat);
        }
        else {
            console.log("Invalid pet type. Please enter Dog or Cat.");
            continue;
        }
        addAnotherPet = promptForYesNo("Do you want to add another pet? (yes/no): ");
    }
    owner.showPets();
    owner.feedPets();
}
main();

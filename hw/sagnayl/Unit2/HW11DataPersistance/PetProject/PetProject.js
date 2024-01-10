"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.SAVE_FILE = void 0;
var readlineSync = require("readline-sync");
var fs_1 = require("fs");
var Cat_js_1 = require("./Model/Cat.js");
var Dog_js_1 = require("./Model/Dog.js");
var Owner_js_1 = require("./Model/Owner.js");
var JsonHandler_js_1 = require("./Util/JsonHandler.js");
exports.SAVE_FILE = "./data.json";
function promptForInput(prompt) {
    return readlineSync.question(prompt);
}
function promptForYesNo(prompt) {
    var response = readlineSync.question(prompt).toLowerCase();
    return response === 'yes';
}
function loadAndShowData() {
    try {
        var owner = JsonHandler_js_1.default.loadFromJson();
        owner.showPets();
        owner.feedPets();
    }
    catch (error) {
        console.error('Could not load data, try registering a new owner');
    }
}
function deleteData() {
    try {
        fs_1.default.unlinkSync(exports.SAVE_FILE);
        console.log('Data deleted successfully.');
    }
    catch (error) {
        console.error('Error deleting data');
    }
}
function pressKeyToContinue() {
    readlineSync.question("Press enter to continue...", { hideEchoBack: true, mask: '' });
}
function main() {
    var showMainMenu = true;
    console.clear();
    while (showMainMenu) {
        console.log('----- Main Menu -----');
        console.log('1. Load & Show Currently Saved Data');
        console.log('2. Delete Current Data');
        console.log('3. Register the Owner');
        console.log('4. Exit');
        var choice = parseInt(promptForInput('\nEnter your choice (1-4): '));
        switch (choice) {
            case 1:
                console.clear();
                loadAndShowData();
                break;
            case 2:
                console.clear();
                deleteData();
                break;
            case 3:
                console.clear();
                var ownerFirstName = promptForInput("Enter owner's first name: ");
                var ownerLastName = promptForInput("Enter owner's last name: ");
                var ownerAge = parseInt(promptForInput("Enter owner's age: "));
                var owner = new Owner_js_1.Owner(ownerFirstName, ownerLastName, ownerAge);
                var addAnotherPet = true;
                while (addAnotherPet) {
                    var petType = promptForInput("Enter the pet type (Dog or Cat): ");
                    var petName = promptForInput("Enter pet's name: ");
                    var petBreedOrColor = promptForInput("Enter pet's ".concat(petType === 'Dog' ? 'breed' : 'color', ": "));
                    var petAge = parseInt(promptForInput("Enter pet's age: "));
                    if (petType.toLowerCase() === 'dog') {
                        var dog = new Dog_js_1.Dog(petName, petBreedOrColor, petAge);
                        owner.addPet(dog);
                    }
                    else if (petType.toLowerCase() === 'cat') {
                        var cat = new Cat_js_1.Cat(petName, petBreedOrColor, petAge);
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
                try {
                    JsonHandler_js_1.default.saveJson(owner);
                }
                catch (e) {
                    console.error(e);
                    console.error("There was an error saving the owner");
                }
                break;
            case 4:
                showMainMenu = false;
                break;
            default:
                console.log('Invalid choice. Please enter 1, 2, or 3.');
                break;
        }
        if (showMainMenu) {
            pressKeyToContinue();
            console.clear();
        }
    }
}
main();

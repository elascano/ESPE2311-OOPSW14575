import * as readlineSync from 'readline-sync';
import fs from 'fs';
import JsonHandler from '../util/JsonHandler.js';
import { Cat } from '../model/Cat.js';
import { Dog } from '../model/Dog.js';
import { Owner } from '../model/Owner.js';
export const SAVE_FILE = "./data.json";
function promptForInput(prompt) {
    return readlineSync.question(prompt);
}
function promptForYesNo(prompt) {
    const response = readlineSync.question(prompt).toLowerCase();
    return response === 'yes';
}
function loadAndShowData() {
    try {
        const owner = JsonHandler.loadFromJson();
        owner.showPets();
        owner.feedPets();
    }
    catch (error) {
        console.error('Could not load data, try registering a new owner');
    }
}
function deleteData() {
    try {
        fs.unlinkSync(SAVE_FILE);
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
    let showMainMenu = true;
    console.clear();
    while (showMainMenu) {
        console.log('----- Main Menu -----');
        console.log('1. Load & Show Currently Saved Data');
        console.log('2. Delete Current Data');
        console.log('3. Register the Owner');
        console.log('4. Exit');
        const choice = parseInt(promptForInput('\nEnter your choice (1-4): '));
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
                const ownerFirstName = promptForInput("Enter owner's first name: ");
                const ownerLastName = promptForInput("Enter owner's last name: ");
                const ownerAge = parseInt(promptForInput("Enter owner's age: "));
                const owner = new Owner(ownerFirstName, ownerLastName, ownerAge);
                let addAnotherPet = true;
                while (addAnotherPet) {
                    const petType = promptForInput("Enter the pet type (Dog or Cat): ").toLowerCase();
                    const petName = promptForInput("Enter pet's name: ");
                    const petBreedOrColor = promptForInput(`Enter pet's ${petType === 'dog' ? 'breed' : 'color'}: `);
                    const petAge = parseInt(promptForInput("Enter pet's age: "));
                    if (petType === 'dog') {
                        const dog = new Dog(petName, petBreedOrColor, petAge);
                        owner.addPet(dog);
                    }
                    else if (petType === 'cat') {
                        const cat = new Cat(petName, petBreedOrColor, petAge);
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
                    JsonHandler.saveJson(owner);
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
//# sourceMappingURL=PetProject.js.map
import fs from 'fs';
import { Cat } from '../Model/Cat.js';
import { Dog } from '../Model/Dog.js';
import { Owner } from '../Model/Owner.js';
import { SAVE_FILE } from '../PetProject.js';

export default class JsonHandler {
    public static loadFromJson(): Owner {
        const file = fs.readFileSync(SAVE_FILE, { encoding: 'utf-8' });
        const object = JSON.parse(file);
        const objectPets = object["pets"];
        const pets: (Dog | Cat)[] = [];
        for (const objPet of objectPets) {
            if (objPet["type"] == "cat") {
                pets.push(new Cat(objPet["name"], objPet["color"], objPet["age"]));
            } else if (objPet["type"] == "dog") {
                pets.push(new Dog(objPet["name"], objPet["breed"], objPet["age"]));
            }
        }
        const owner = new Owner(object["firstName"], object["lastName"], object["age"]);
        owner.pets = pets;
        return owner;
    }

    public static saveJson(owner: Owner): void {
        const petsData = owner.pets.map(pet => {
            if (pet instanceof Cat) {
                return {
                    type: 'cat',
                    name: pet.name,
                    color: pet.color,
                    age: pet.age
                };
            } else if (pet instanceof Dog) {
                return {
                    type: 'dog',
                    name: pet.name,
                    breed: pet.breed,
                    age: pet.age
                };
            }
            return null;
        });

        const ownerData = {
            firstName: owner.firstName,
            lastName: owner.lastName,
            age: owner.age,
            pets: petsData
        };

        const jsonContent = JSON.stringify(ownerData, null, 2);

        fs.writeFileSync(SAVE_FILE, jsonContent, { encoding: 'utf-8', flag: "w" });
    }
}

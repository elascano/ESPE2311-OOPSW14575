import fs from 'fs';

import { SAVE_FILE } from '../view/PetProject.js';
import { Owner } from '../model/Owner.js';
import { Cat } from '../model/Cat.js';
import { Dog } from '../model/Dog.js';

export default class JsonHandler {
    public static loadFromJson(): Owner {
        const file = fs.readFileSync(SAVE_FILE, { encoding: 'utf-8' });
        const object = JSON.parse(file);
        const objectPets = object["pets"];
        const owner = new Owner(object["firstName"], object["lastName"], object["age"]);
    
        const pets: (Dog | Cat)[] = owner.getPets();
        for (const objPet of objectPets) {
            if (objPet["type"] == "cat") {
                pets.push(new Cat(objPet["name"], objPet["color"], objPet["age"]));
            } else if (objPet["type"] == "dog") {
                pets.push(new Dog(objPet["name"], objPet["breed"], objPet["age"]));
            }
        }
    
        return owner;
        }

    public static saveJson(owner: Owner): void {
        const petsData = owner.getPets().map(pet => {
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

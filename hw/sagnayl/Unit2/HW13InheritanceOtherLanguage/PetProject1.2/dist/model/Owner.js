import { Cat } from './Cat.js';
import { Dog } from './Dog.js';
export class Owner {
    constructor(firstName, lastName, age) {
        this._firstName = firstName;
        this._lastName = lastName;
        this._age = age;
        this._pets = [];
    }
    get firstName() {
        return this._firstName;
    }
    set firstName(ownerFirstName) {
        this._firstName = ownerFirstName;
    }
    get lastName() {
        return this._lastName;
    }
    set lastName(ownerLastName) {
        this._lastName = ownerLastName;
    }
    get age() {
        return this._age;
    }
    set age(ownerAge) {
        this._age = ownerAge;
    }
    getPets() {
        return this._pets;
    }
    addPet(pet) {
        this._pets.push(pet);
    }
    showPets() {
        console.log(`${this._firstName} ${this._lastName}'s Pets:`);
        this._pets.forEach(pet => {
            console.log(`${pet instanceof Dog ? 'Dog' : 'Cat'} - Name: ${pet.name}, Age: ${pet.age}, Sound: ${pet.makeSound()}`);
        });
    }
    feedPets() {
        console.log(`${this._firstName} ${this._lastName} is feeding their pets.`);
    }
}
//# sourceMappingURL=Owner.js.map
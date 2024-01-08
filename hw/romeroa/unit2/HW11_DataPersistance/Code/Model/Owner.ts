import { Cat } from './Cat.js';
import { Dog } from './Dog.js';

export class Owner {
    firstName: string;
    lastName: string;
    age: number;
    pets: (Dog | Cat)[];

    constructor(firstName: string, lastName: string, age: number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pets = [];
    }

    addPet(pet: Dog | Cat): void {
        this.pets.push(pet);
    }

    showPets(): void {
        console.log(`${this.firstName} ${this.lastName}'s Pets:`);
        this.pets.forEach(pet => {
            console.log(`${pet instanceof Dog ? 'Dog' : 'Cat'} - Name: ${pet.name}, Age: ${pet.age}, Sound: ${pet.makeSound()}`);
        });
    }

    feedPets(): void {
        console.log(`${this.firstName} ${this.lastName} is feeding their pets.`);
    }
}

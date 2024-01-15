import { Cat } from './Cat.js';
import { Dog } from './Dog.js';

export class Owner {
    private _firstName: string;
    private _lastName: string;
    private _age: number;
    private _pets: (Dog | Cat)[];

    constructor(firstName: string, lastName: string, age: number) {
        this._firstName = firstName;
        this._lastName = lastName;
        this._age = age;
        this._pets = [];
    }

    public get firstName(): string {
        return this._firstName;
    }

    public set firstName(ownerFirstName: string) {
        this._firstName = ownerFirstName;
    }

    public get lastName(): string {
        return this._lastName;
    }

    public set lastName(ownerLastName: string) {
        this._lastName = ownerLastName;
    }

    public get age(): number {
        return this._age;
    }

    public set age(ownerAge: number) {
        this._age = ownerAge;
    }

    public getPets(): (Dog | Cat)[] {
        return this._pets;
    }

    public addPet(pet: Dog | Cat): void {
        this._pets.push(pet);
    }

    showPets(): void {
        console.log(`${this._firstName} ${this._lastName}'s Pets:`);
        this._pets.forEach(pet => {
            console.log(`${pet instanceof Dog ? 'Dog' : 'Cat'} - Name: ${pet.name}, Age: ${pet.age}, Sound: ${pet.makeSound()}`);
        });
    }

    public feedPets(): void {
        console.log(`${this._firstName} ${this._lastName} is feeding their pets.`);
    }
}
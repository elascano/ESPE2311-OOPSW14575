import { Pet } from './Pet.js';

export class Dog extends Pet {
    private _breed: string;

    constructor(name: string, breed: string, age: number) {
        super(name, age);
        this._breed = breed;
    }

    public get breed(): string {
        return this._breed;
    }

    public set breed(dogBreed: string) {
        this._breed = dogBreed;
    }

    makeSound(): string {
        return "Woof, woof";
    }
}
import { Pet } from './Pet.js';
export class Dog extends Pet {
    constructor(name, breed, age) {
        super(name, age);
        this._breed = breed;
    }
    get breed() {
        return this._breed;
    }
    set breed(dogBreed) {
        this._breed = dogBreed;
    }
    makeSound() {
        return "Woof, woof";
    }
}
//# sourceMappingURL=Dog.js.map
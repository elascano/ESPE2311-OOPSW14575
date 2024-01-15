export class Pet {
    constructor(name, age) {
        this._name = name;
        this._age = age;
    }
    get name() {
        return this._name;
    }
    set name(petName) {
        this._name = petName;
    }
    get age() {
        return this._age;
    }
    set age(petAge) {
        this._age = petAge;
    }
    makeSound() {
        return "Generic pet sound";
    }
}
//# sourceMappingURL=Pet.js.map
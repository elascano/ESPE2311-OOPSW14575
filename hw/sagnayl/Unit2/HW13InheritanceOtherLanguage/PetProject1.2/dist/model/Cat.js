export class Cat {
    constructor(name, color, age) {
        this._name = name;
        this._color = color;
        this._age = age;
    }
    get name() {
        return this._name;
    }
    set name(catName) {
        this._name = catName;
    }
    get color() {
        return this._color;
    }
    set color(catColor) {
        this._color = catColor;
    }
    get age() {
        return this._age;
    }
    set age(catAge) {
        this._age = catAge;
    }
    makeSound() {
        return "Meow, meow";
    }
}
//# sourceMappingURL=Cat.js.map
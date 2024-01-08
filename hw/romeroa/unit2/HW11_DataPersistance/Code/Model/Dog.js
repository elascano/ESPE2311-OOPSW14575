"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Dog = void 0;
var Dog = /** @class */ (function () {
    function Dog(name, breed, age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    Dog.prototype.makeSound = function () {
        return "Woof, woof";
    };
    return Dog;
}());
exports.Dog = Dog;

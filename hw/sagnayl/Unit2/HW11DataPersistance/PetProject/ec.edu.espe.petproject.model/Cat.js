"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.Cat = void 0;
var Cat = /** @class */ (function () {
    function Cat(name, color, age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }
    Cat.prototype.makeSound = function () {
        return "Meow, meow";
    };
    return Cat;
}());
exports.Cat = Cat;

import { Pet } from './Pet.js';

export class Cat extends Pet {
    private _color: string;

    constructor(name: string, color: string, age: number) {
        super(name, age);
        this._color = color;
    }

    public get color(): string {
        return this._color;
    }

    public set color(catColor: string) {
        this._color = catColor;
    }

    makeSound(): string {
        return "Meow, Meow";
    }
}
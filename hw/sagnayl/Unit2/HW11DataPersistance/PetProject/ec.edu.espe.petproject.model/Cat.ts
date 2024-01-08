export class Cat {
    private _name: string;
    private _color: string;
    private _age: number;

    constructor(name: string, color: string, age: number) {
        this._name = name;
        this._color = color;
        this._age = age;
    }

    public get name(): string {
        return this._name;
    }

    public set name(catName: string) {
        this._name = catName;
    }

    public get color(): string {
        return this._color;
    }

    public set color(catColor: string) {
        this._color = catColor;
    }

    public get age(): number {
        return this._age;
    }

    public set age(catAge: number) {
        this._age = catAge;
    }

    makeSound(): string {
        return "Meow, meow";
    }
}

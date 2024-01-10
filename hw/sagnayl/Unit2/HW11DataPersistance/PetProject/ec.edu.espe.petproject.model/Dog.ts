export class Dog {
    private _name: string;
    private _breed: string;
    private _age: number;

    constructor(name: string, breed: string, age: number) {
        this._name = name;
        this._breed = breed;
        this._age = age;
    }

    public get name(): string {
        return this._name;
    }

    public set name(dogName: string) {
        this._name = dogName;
    }

    public get breed(): string {
        return this._breed;
    }

    public set breed(dogBreed: string) {
        this._name = dogBreed;
    }

    public get age(): number {
        return this._age;
    }

    public set age(dogAge: number) {
        this._age = dogAge;
    }

    makeSound(): string {
        return "Woof, woof";
    }
}

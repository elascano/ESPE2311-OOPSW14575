export class Pet {
    protected _name: string;
    protected _age: number;

    constructor(name: string, age: number) {
        this._name = name;
        this._age = age;
    }

    public get name(): string {
        return this._name;
    }

    public set name(petName: string) {
        this._name = petName;
    }

    public get age(): number {
        return this._age;
    }

    public set age(petAge: number) {
        this._age = petAge;
    }

    makeSound(): string {
        return "Generic pet sound";
    }
}
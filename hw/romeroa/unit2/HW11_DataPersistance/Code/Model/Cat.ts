export class Cat {
    name: string;
    color: string;
    age: number;

    constructor(name: string, color: string, age: number) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    makeSound(): string {
        return "Meow, meow";
    }
}

import * as readlineSync from 'readline-sync';

class Dog {
    name: string;
    breed: string;
    age: number;

    constructor(name: string, breed: string, age: number) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }

    makeSound(): string {
        return "Woof, woof";
    }
}

class Cat {
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

class Owner {
    firstName: string;
    lastName: string;
    age: number;
    pets: (Dog | Cat)[];

    constructor(firstName: string, lastName: string, age: number) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pets = [];
    }

    addPet(pet: Dog | Cat): void {
        this.pets.push(pet);
    }

    showPets(): void {
        console.log(`${this.firstName} ${this.lastName}'s Pets:`);
        this.pets.forEach(pet => {
            console.log(`${pet instanceof Dog ? 'Dog' : 'Cat'} - Name: ${pet.name}, Age: ${pet.age}, Sound: ${pet.makeSound()}`);
        });
    }

    feedPets(): void {
        console.log(`${this.firstName} ${this.lastName} is feeding their pets.`);
    }
}

function promptForInput(prompt: string): string {
    return readlineSync.question(prompt);
}

function promptForYesNo(prompt: string): boolean {
    const response = readlineSync.question(prompt).toLowerCase();
    return response === 'yes';
}

function main() {
    const ownerFirstName = promptForInput("Enter owner's first name: ");
    const ownerLastName = promptForInput("Enter owner's last name: ");
    const ownerAge = parseInt(promptForInput("Enter owner's age: "));

    const owner = new Owner(ownerFirstName, ownerLastName, ownerAge);

    let addAnotherPet = true;

    while (addAnotherPet) {
        const petType = promptForInput("Enter the pet type (Dog or Cat): ");
        const petName = promptForInput("Enter pet's name: ");
        const petBreedOrColor = promptForInput(`Enter pet's ${petType === 'Dog' ? 'breed' : 'color'}: `);
        const petAge = parseInt(promptForInput("Enter pet's age: "));

        if (petType.toLowerCase() === 'dog') {
            const dog = new Dog(petName, petBreedOrColor, petAge);
            owner.addPet(dog);
        } else if (petType.toLowerCase() === 'cat') {
            const cat = new Cat(petName, petBreedOrColor, petAge);
            owner.addPet(cat);
        } else {
            console.log("Invalid pet type. Please enter Dog or Cat.");
            continue;
        }

        addAnotherPet = promptForYesNo("Do you want to add another pet? (yes/no): ");
    }

    owner.showPets();
    owner.feedPets();
}

main();
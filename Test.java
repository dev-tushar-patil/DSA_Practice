class Animal {
    void eat() {
        System.out.println("Animal Eats...!");
    }
}

class Dog extends Animal{
    void bark() {
        System.out.println("Dog Barks...!");
    }
}

public class Test {
    public static void main(String[] args) {
        System.out.println("By Creating Animal Object ...");
        Animal animal = new Animal();
        animal.eat();
        System.out.println();

        System.out.println("By Creating Dog Object...");
        Dog dog = new Dog();
        dog.eat();
        dog.bark();

    }
}
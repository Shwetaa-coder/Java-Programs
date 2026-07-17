// Parent class
class Inheritance {
    void eat() {
        System.out.println("Animal is eating");
    }
}

// Child class
class Dog extends Inheritance {
    void bark() {
        System.out.println("Dog is barking");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Dog d = new Dog();

        d.eat();   // Inherited from Animal
        d.bark();  // Dog's own method
    }
}
    

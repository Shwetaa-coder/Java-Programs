// Parent Class
class Animal {

    void eat() {
        System.out.println("Animal is eating.");
    }
}

// Child Class
class Dog extends Animal {

    void bark() {
        System.out.println("Dog is barking.");
    }

    @Override
    void eat() {
        System.out.println("Dog is eating.");
    }
}

public class UpcastingAndDowncasting {

    public static void main(String[] args) {
        /*
         * UPCASTING
         * Child object is stored in a Parent reference.
         * This happens automatically (implicit casting).
         */
        Animal animal = new Dog(); // Upcasting
        System.out.println("----- Upcasting -----");

        // Parent method can be called.
        animal.eat();

        // Child-specific methods cannot be accessed.
        // animal.bark(); // Compile-time Error

        /*
         * Important:
         * The object is actually of Dog,
         * but the reference type is Animal.
         * Therefore only Animal's accessible members
         * can be called through this reference.
         */

        // ===========================
        // DOWNCASTING
        // ===========================

        System.out.println("\n----- Downcasting -----");

        // Convert Parent reference back to Child reference.
        // Explicit casting is required.

        Dog dog = (Dog) animal; // Downcasting

        dog.eat(); // Overridden method
        dog.bark(); // Child-specific method

        /*
         * Important:
         * Downcasting is safe only because
         * 'animal' actually refers to a Dog object.
         */

        // ===========================
        // UNSAFE DOWNCASTING
        // ===========================

        System.out.println("\n----- Unsafe Downcasting -----");

        Animal a = new Animal();
        a.eat();

        // Dog d = (Dog) a; // Runtime Error
        // ClassCastException

        /*
         * Why?
         * 'a' refers to an Animal object,
         * not a Dog object.
         * Java cannot convert an Animal object
         * into a Dog object.
         */

        // ===========================
        // instanceof Operator
        // ===========================

        System.out.println("\n----- Using instanceof -----");

        if (animal instanceof Dog) {
            Dog d = (Dog) animal;
            d.bark();
        }

        /*
         * instanceof checks whether the object
         * actually belongs to the specified class.
         * It helps avoid ClassCastException.
         */
    }
}

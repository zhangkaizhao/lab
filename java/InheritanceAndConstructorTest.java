class Animal {
    String name;

    public Animal() {
        this.name = "animal";
    }

    void eat() {
        System.out.println("I am " + name);
        System.out.println("animal: eat");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("I am " + name);
        System.out.println("dog: eat");
    }
}

public class InheritanceAndConstructorTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();

        Dog d = new Dog();
        d.eat();
    }
}

interface Animal {
    public void speak();
}

class Dog implements Animal {
    public void speak() {
        System.out.println("I am a dog.");
    }
}

public class InterfaceAndClassTest {
    public static void main(String[] args) {
        Animal d = new Dog();
        d.speak();
    }
}

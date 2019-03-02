/* https://www.runoob.com/java/java-polymorphism.html */

abstract class Animal {
    abstract void eat();
}

class Cat extends Animal {
    public void eat() {
        System.out.println("吃鱼");
    }

    public void work() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("吃骨头");
    }

    public void work() {
        System.out.println("看家");
    }
}

public class PolymorphismDemo {
    public static void show(Animal a) {
        a.eat();

        // 类型判断
        if (a instanceof Cat) {
            Cat c = (Cat)a;
            c.work();
        } else if (a instanceof Dog) {
            Dog d = (Dog)a;
            d.work();
        }
    }

    public static void main(String[] args) {
        show(new Cat()); // 以 Cat 对象调用 show 方法
        show(new Dog()); // 以 Dog 对象调用 show 方法

        Animal a = new Cat(); // 向上转型
        a.eat(); // 调用的是 Cat 的 eat 方法
        Cat c = (Cat)a; // 向下转型
        c.work(); // 调用的是 Cat 的 work 方法
    }
}

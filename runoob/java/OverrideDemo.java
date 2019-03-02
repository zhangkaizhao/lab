/* https://www.runoob.com/java/java-override-overload.html */

class Animal {
    public void move() {
        System.out.println("动物可以移动");
    }
}

class Dog extends Animal {
    public void move() {
        System.out.println("狗可以跑和走");
    }

    public void bark() {
        System.out.println("狗可以吠");
    }
}

public class OverrideDemo {
    public static void main(String[] args) {
        Animal a = new Animal(); // Animal 对象
        Dog b = new Dog(); // Dog 对象
        Animal c = new Dog(); // Dog 对象

        a.move(); // 执行 Animal 类的方法

        b.move(); // 执行 Dog 类的方法
        b.bark(); // 执行 Dog 类的方法

        c.move(); // 执行 Dog 类的方法
        //c.bark(); // Error: cannot find symbol 因为 b 的引用类型 Animal 没有 bark 方法
    }
}

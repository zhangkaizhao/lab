/* https://www.runoob.com/java/java-generics.html */

import java.util.*;

class GenericDemo {

    public static void getData(List<?> data) {
        System.out.println("data :" + data.get(0));
    }

    public static void getNumber(List<? extends Number> data) {
        System.out.println("data :" + data.get(0));
    }

    public static void getSuperNumber(List<? super Number> data) {
        System.out.println("data :" + data.get(0));
    }

    public static void main(String[] args) {
        List<String> name = new ArrayList<String>();
        List<Integer> age = new ArrayList<Integer>();
        List<Number> number = new ArrayList<Number>();

        name.add("icon");
        age.add(18);
        number.add(314);

        getData(name); // data :icon
        getData(age); // -> data :18
        getData(number); // -> data :314

        //getNumber(name); // Error
        getNumber(age); // -> data :18
        getNumber(number); // -> data :314

        List<Object> object = new ArrayList<Object>();
        object.add("def");

        //getSuperNumber(name); // Error
        //getSuperNumber(age); // -> Error
        getSuperNumber(number); // -> data :314
        getSuperNumber(object); // -> data :def
    }
}

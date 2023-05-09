package lesson8_Non_accessmodifires;

public class Car {
    String Color = "blue";
    String engine = "V6";

}

class Human{
    String name = "Ivan";
    Car c = new Car();

    public static void main(String[] args) {
        Human h1 = new Human();
        h1.c = new Car();
        h1.c = new Car();
        h1.c.engine = "V8";
    }
}

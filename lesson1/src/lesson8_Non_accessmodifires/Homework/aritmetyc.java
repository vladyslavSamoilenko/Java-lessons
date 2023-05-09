package lesson8_Non_accessmodifires.Homework;

class operations {
    static final double pi = 3.14;
    static double r;
    static int mult(int a, int b, int c){
        return a*b*c;
    }

    static void divide(int a, int b){
        int wyn = a/b;
        int ost = a%b;
        System.out.println("Result of dividing: " + wyn + " -> ostatok: " + ost);
    }

    double circle_field(double r){
        double field = pi*r*r;
        return field;
    }

    static double circle_length(double r){
        double length = 2 * pi * r;
        return length;
    }

    void show_info(double r){
        System.out.println("Radius: " + r);
        System.out.println("Circle field: " + circle_field(r));
        System.out.println("Circle length: " + circle_length(r));
    }
}


public class aritmetyc {
    public static void main(String[] args) {
        operations fun = new operations();

        System.out.println("Result of multiplication: " + operations.mult(3, 4, 6));
        System.out.println("Result of multiplication: " + operations.mult(4, 5, 6));
        operations.divide(5, 2);
        operations.divide(17, 3);

        System.out.println("");

        System.out.println("Circle field: " + fun.circle_field(6));
        System.out.println("Circle length: " + operations.circle_length(5));

        System.out.println("");

        fun.show_info(5);
    }
}

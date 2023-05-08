package car4;

 class car {
    car(String color, String engine){
        Color = color;
        Engine = engine;
    }
    String Color = "red";
    String Engine = "V6";

}

class CarTest{
    public static void main(String[] args) {
        car car1 = new car("yellow", "V4");

        System.out.println(car1.Color);
        System.out.println(car1.Engine);
    }
}

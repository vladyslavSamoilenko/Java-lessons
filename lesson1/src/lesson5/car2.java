package lesson5;

public class car2 {
    String color;
    String engine;
    int speed;

    int gaz(int v){
        speed += v;
        return speed;
    }

    int brek(int otr_v){
        speed -= otr_v;
        return speed;
    }

    void showInfo(){
        System.out.println("color: " + color + " Engine: " + engine + " Speed: " + speed );
    }
}

class CarTest{
    public static void main(String[] args) {
        car2 c1 = new car2();
        c1.color = "White";
        c1.engine = "V6";
        c1.speed = 60;

        c1.showInfo();
        c1.gaz(20);
        c1.showInfo();
        c1.brek(40);
        c1.showInfo();
    }
}
package Lesson6;

public class MethodOverloading {
    void show(int a){
        System.out.println(a);
    }
    void show(boolean b){
        System.out.println(b);
    }
}
class MethodOverloadingTest {
    public static void main(String[] args) {
        MethodOverloading mO = new MethodOverloading();
        int a = 100;
        mO.show(a);
        boolean b = true;
        mO.show(b);
    }
}

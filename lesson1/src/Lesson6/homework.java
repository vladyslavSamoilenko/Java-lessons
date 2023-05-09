package Lesson6;
class methods{
    int suma(){
        return 0;
    }
    int suma(int a){
        return a;
    }
    int suma(int a, int b){
        return a+b;
    }
    int suma(int a, int b, int c){
        return a+b+c;
    }
    int suma(int a, int b, int c, int d){
        return a+b+c+d;
    }
    int suma(int a, int b, int c, int d, int e){
        return a+b+c+d+e;
    }

    String suma(String a, String b){
        return a+b;
    }
}

public class homework {


    public static void main(String[] args) {
        methods f = new methods();
        System.out.println(f.suma());
    }
}

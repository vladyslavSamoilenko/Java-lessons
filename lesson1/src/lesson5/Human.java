package lesson5;

public class Human {
     String name;
     Car3 car;
     BankAccount bA;

     void info(){
         System.out.println("Name: " + name + " | Car color: " + car.color +" |" + "Bank Account balance: " + bA.balance );
     }
}

class Car3{
    Car3(String c, String e){
        color = c;
        engine = e;
    }
    String color;
    String engine;
}

class BankAccount{
    BankAccount(int id2, int balance2){
        id = id2;
        balance = balance2;
    }
    int id;
    double balance;

   double popolnenieScheta(double suma_popolnienia){
       double new_balance = suma_popolnienia + balance;
       balance = new_balance;
       return new_balance;
   }

   double snyatieSoScheta(double suma_snyatia){
       double new_balance = balance - suma_snyatia;
       balance = new_balance;
       return new_balance;
   }

}
class HumanTest{
    public static void main(String[] args) {
        Human h = new Human();
        h.name = "Oleh";
        h.car = new Car3("Red", "V8");
        h.bA = new BankAccount(1, 256);
        h.info();
        h.bA.popolnenieScheta(56);
        h.info();
        h.bA.snyatieSoScheta(10);
        h.info();

    }
}
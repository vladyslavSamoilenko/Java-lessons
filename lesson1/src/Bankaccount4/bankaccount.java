package Bankaccount4;

public class bankaccount {
    int id ;
    String name = "Piotr";
    double balance;

    public static void main(String[] args) {
        bankaccount MyAccount = new bankaccount();
        bankaccount YourAccount = new bankaccount();

        MyAccount.id = 1;
        MyAccount.name = "Vlad";
        MyAccount.balance = 20.35;

        YourAccount.id = 2;
        YourAccount.name = "Alex";
        YourAccount.balance = 135.6;

        System.out.println(MyAccount.name);

    }
}



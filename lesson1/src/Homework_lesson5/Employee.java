package Homework_lesson5;

class Employee {
    int id;
    String Surname;
    int Age;
    double Salary;
    String department;


}

class EmployeeTest{
    double twice(Employee Surname){
        System.out.println("Salary of " + Surname.Surname + " was " + Surname.Salary + ".");
        Surname.Salary *= 2;
        System.out.println("Now salary " + Surname.Salary);
        return Surname.Salary;
    }

    public static void main(String[] args) {

        Employee FirstImpl = new Employee();
        Employee SecondImpl = new Employee();
        EmployeeTest Test = new EmployeeTest();

        FirstImpl.id = 1;
        FirstImpl.Age = 23;
        FirstImpl.Surname = "Starski";
        FirstImpl.department = "IT";
        FirstImpl.Salary = 4500;

        SecondImpl.id = 15;
        SecondImpl.Age = 26;
        SecondImpl.Surname = "Wirski";
        SecondImpl.department = "Finance";
        SecondImpl.Salary = 6000;

        Test.twice(FirstImpl);
    }
}

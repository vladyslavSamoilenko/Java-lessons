package lesson8_Non_accessmodifires;

public class Student {
    String name;
    int year;
    static int count;
     public Student(String name2, int year2){
         count++;
         name = name2;
         year = year2;
         System.out.println("Student #" + count + " is created " + name);
     }
}

class StudentTest{
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 1);
        Student st2 = new Student("Piotr", 4);
        Student st3 = new Student("Masha", 2);
        System.out.println(Student.count);
    }
}
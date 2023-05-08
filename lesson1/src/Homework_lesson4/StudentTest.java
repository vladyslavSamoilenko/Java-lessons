package Homework_lesson4;

class Student{

    Student(int NrAlbumu1, String Name1, String Surname1, int year1, double Average_math1, double Average_economic1, double Average_ForeignLanguage1){

        this(NrAlbumu1, Name1, Surname1, year1);
        Average_math = Average_math1;
        Average_economic = Average_economic1;
        Average_ForeignLanguage = Average_ForeignLanguage1;
    }

    Student (int NrAlbumu2, String Name2, String Surname2, int year2){

        NrAlbumu = NrAlbumu2;
         Name = Name2;
         Surname = Surname2;
         year = year2;
    }

    Student(){
    }
    int NrAlbumu;
    String Name;
    String Surname;
    int year;
    double Average_math;
    double Average_economic;
    double Average_ForeignLanguage;

}

class StudentTest {
    double AVG(Student st){
        double average = (st.Average_math+st.Average_economic+st.Average_ForeignLanguage)/3;
        System.out.println("Average student score: " + average);
        return average;
    }

    public static void main(String[] args) {
        Student First = new Student(1, "Kuba", "Sabic", 1, 4,3,4.5);
        Student Second = new Student();
        Student Thierd = new Student(3, "Oleg", "Bandera", 2);

        System.out.println();


    }

}

package lesson5;

public class lesson5 {
    int summa(int a,int b, int c){
        int result = a + b + c;
        return result;
    }

    int sredneeArifm(int a1, int b1, int c1){
        int result2 = summa(a1,b1,c1)/3;
        return result2;
    }
}
 class Test{
     public static void main(String[] args) {
         lesson5 t = new lesson5();
         int summaTrexChisel = t.summa(1,2,4);

         System.out.println(summaTrexChisel);
         System.out.println(t.sredneeArifm(20,40,60));
     }
 }
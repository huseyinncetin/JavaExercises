import java.util.Scanner;

public class Main {

   static boolean asal(int number,int i){

       if(number<=2){
           return (number==2) ? true : false;
       }
       if(number % i ==0){
           return false;
       }
       if(i>number/2)
           return true;

        return asal(number,i+1);
   }

    public static void main(String[] args) {
       int number;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı Giriniz :");
        number = input.nextInt();

        if(asal(number,2)){
            System.out.println(number+" ASALDIR !");
        }
        else
            System.out.println(number+" ASAL değildir !");

    }
}
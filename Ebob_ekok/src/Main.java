import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1,num2,i=1,ebob=1,ekok=1;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk sayıyı giriniz:");
        num1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        num2 = input.nextInt();

        while(i<num1){
            if(num1%i==0 && num2%i==0){
                System.out.println(i);
                ebob = i;
            }
            i++;
        }
        System.out.println(num1+" ve "+num2+" nin EBOB : "+ebob);
        while(i<num1*num2){
            if(i%num1==0 && i%num2==0){
                System.out.println(i);
                ekok = i;
                break;
            }
            i++;
        }
        System.out.println(num1+" ve "+num2+" nin EKOK : "+ekok);
    }
}
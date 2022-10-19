import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        sayi = input.nextInt();

        while(sayi%2==0){
            System.out.print("Sayı giriniz:");
            sayi = input.nextInt();

            if(sayi%2==0&& sayi%4 ==0){
                toplam +=sayi;
            }
        }
        System.out.println("Tebrikler tek sayı girdiniz!!!");
        System.out.println("Girilen değerlerden çift ve 4 ün katı olan değerlerin toplamı:"+toplam);
    }
}
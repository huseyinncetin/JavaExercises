import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        sayi= input.nextInt();

        for(int i=1;i<=sayi/2;i++){
            if(sayi%i==0){
                toplam +=i;
            }
        }
        if(toplam==sayi){
            System.out.println(sayi+" Mükemmel sayıdır.");
        }
        else
            System.out.println(sayi+" Mükemmel sayı değildir.");
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,toplam=0,sayac=0;
        double ortalama;

        Scanner input = new Scanner(System.in);
        System.out.print("Sayıyı giriniz:");
        sayi = input.nextInt();

        for(int i=1;i<=sayi;i++){
            if(i%3==0 && i%4==0){
                toplam +=i;
                sayac++;
            }
        }
        ortalama=toplam/sayac;
        System.out.println("3 ve 4 bölünen sayıların ortalaması:"+ortalama);
    }
}
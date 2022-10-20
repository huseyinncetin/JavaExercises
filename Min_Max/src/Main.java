import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,i=0,kucuk=0,buyuk=0,ilksayi;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz:");
        sayi = input.nextInt();

        while(i<sayi){
            System.out.print("Sayıyı giriniz:");
            ilksayi= input.nextInt();
            if(i==0){
                buyuk=ilksayi;
                kucuk=ilksayi;
            }
            else{
                if(ilksayi>buyuk){
                    buyuk =ilksayi;
                }
                else if(ilksayi<kucuk){
                    kucuk =ilksayi;
                }
            }
            i++;
        }
        System.out.println("En büyük sayı:"+buyuk);
        System.out.println("En küçük sayı:"+kucuk );
    }
}
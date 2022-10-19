import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sayi,us,toplam=1;

        Scanner input = new Scanner(System.in);

        System.out.print("Sayıyı giriniz:");
        sayi = input.nextInt();

        System.out.print("Üssünü giriniz:");
        us = input.nextInt();

        for(int i=1;i<=us;i++){
            toplam *=sayi;
        }

        System.out.println(sayi+" üzeri "+us+"= "+toplam);
    }
}
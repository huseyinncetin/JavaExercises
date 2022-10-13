import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.

        double km,tutar,fiyat;
        Scanner input = new Scanner(System.in);

        System.out.println("Km yi giriniz:");
        km = input.nextFloat();

        tutar =10 + (km*2.20);

         fiyat = (tutar <= 20 ? 20 : tutar);

         System.out.println("Ödenecek Tutar:"+ fiyat);

    }
}
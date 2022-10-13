import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Double A,E,M,D,P,Toplam=0.0;
        Scanner input = new Scanner(System.in);

        System.out.println("Armut Kaç Kilo ? :");
        A =input.nextDouble();
        Toplam += A*2.14;

        System.out.println("Elma Kaç Kilo ? :");
        E =input.nextDouble();
        Toplam += E * 3.67;

        System.out.println("Muz Kaç Kilo ? :");
        M =input.nextDouble();
        Toplam += M * 0.95 ;

        System.out.println("Domates Kaç Kilo ? :");
        D =input.nextDouble();
        Toplam += D * 1.11;

        System.out.println("Patlıcan Kaç Kilo ? :");
        P =input.nextDouble();
        Toplam += P * 5.00;

        System.out.println("Toplam Tutar :"+Toplam);
    }
}
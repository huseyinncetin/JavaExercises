import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy,kilo,indeks;
        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
        boy = input.nextFloat();

        System.out.println("Lütfen kilonuzu giriniz :");
        kilo = input.nextFloat();

        indeks = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz :"+indeks);
    }
}
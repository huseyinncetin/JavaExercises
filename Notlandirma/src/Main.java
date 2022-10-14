import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int matematik,kimya,fizik,muzik,turkce,toplam=0,ortalama;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz:");
        matematik = input.nextInt();
        if(matematik<0 ||matematik>100) {
            System.out.println("0-100 aralığı dışındaki notlar ortalamaya katılmaz.");
        }
        else
            toplam+=matematik;
        System.out.print("Müzik notunuzu giriniz:");
        muzik = input.nextInt();
        if(muzik<0 ||muzik>100) {
            System.out.println("0-100 aralığı dışındaki notlar ortalamaya katılmaz.");
        }
        else
            toplam+=muzik;
        System.out.print("Fizik notunuzu giriniz:");
        fizik = input.nextInt();
        if(fizik<0 ||fizik>100) {
            System.out.println("0-100 aralığı dışındaki notlar ortalamaya katılmaz.");
        }
        else
            toplam+=fizik;
        System.out.print("Kimya notunuzu giriniz:");
        kimya = input.nextInt();
        if(kimya<0 ||kimya>100) {
            System.out.println("0-100 aralığı dışındaki notlar ortalamaya katılmaz.");
        }
        else
            toplam+=kimya;
        System.out.print("Türkçe notunuzu giriniz:");
        turkce = input.nextInt();
        if(turkce<0 ||turkce>100) {
            System.out.println("0-100 aralığı dışındaki notlar ortalamaya katılmaz.");
        }
        else
            toplam+=turkce;

        ortalama =toplam/5;
        if(ortalama>=55){
            System.out.println("Tebrikler geçtiniz!!!");
        }
        else
        System.out.println("KALDINIZ...");


    }
}
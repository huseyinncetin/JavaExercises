import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        int müzik,matematik,fizik,tarih,türkce,kimya;
        double ortalama;

        Scanner input =new Scanner(System.in);

        System.out.println("Müzik Notunu giriniz:");
        müzik = input.nextByte();
        System.out.println("matematik Notunu giriniz:");
        matematik = input.nextByte();
        System.out.println("fizik Notunu giriniz:");
        fizik = input.nextByte();
        System.out.println("tarih Notunu giriniz:");
        tarih = input.nextByte();
        System.out.println("türkce Notunu giriniz:");
        türkce = input.nextByte();
        System.out.println("kimya Notunu giriniz:");
        kimya = input.nextByte();

        ortalama = (matematik + müzik + kimya + tarih + türkce + fizik)/6;

        String durum = (ortalama >= 60 ? "Geçti" : "Kaldı");
        System.out.println(durum);

    }
}
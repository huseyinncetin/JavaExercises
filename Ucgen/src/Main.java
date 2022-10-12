import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        // Üçgenin çevresi 2u
        // 𝑢 = (a+b+c) / 2
        // Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
        // x = alan^2
        double kenar1,kenar2,kenar3,u;
        double x,Alan;

        Scanner input = new Scanner(System.in);
        System.out.println("Kenarları giriniz:");
        kenar1 = input.nextInt();
        kenar2 = input.nextInt();
        kenar3 = input.nextInt();

        u = (kenar1+kenar2+kenar3)/2;
        x = (u*(u-kenar1)*(u-kenar2)*(u-kenar3));
        Alan = Math.sqrt(x);

        System.out.println("Üçgenin alanı:\t" + Alan);

    }
}
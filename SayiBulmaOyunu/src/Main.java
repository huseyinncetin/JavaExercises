import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int) (Math.random() * 100);
        int right = 5;
        int tahmin = 0;

        while (right > 0) {
            System.out.print("Sayı giriniz :");
            tahmin = input.nextInt();

            if (tahmin == number) {
                System.out.println("Tebrikler tahmininiz doğru!!!");
                return;
            }
            else {
                if (tahmin < 0 || tahmin > 100) {
                    System.out.println("Lütfen 0-100 aralığında bir değer giriniz.");
                    right--;

                }
                if (tahmin > number) {
                    System.out.println("Tahmininiz doğru değil.Daha küçük bir sayı deneyin.");
                    right--;
                    System.out.print("Kalan hakkınız :" + right+"\n");
                }
                else if (tahmin < number) {
                    System.out.println("Tahmininiz doğru değil.Daha büyük bir sayı deneyin.");
                    right--;
                    System.out.print("Kalan hakkınız :" + right+"\n");
                }
            }
        }
        System.out.println("Hakkınız kalmadı!!!.Tahmin edilmesi istenen sayı:"+number);
    }
}
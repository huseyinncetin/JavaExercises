import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pi =3.14,r,a,Alan;

        Scanner input = new Scanner(System.in);
        System.out.println("Dairenin yarıçapını girinizi:");
        r = input.nextFloat();

        System.out.println("Alanı bulunmak istenen açıyı girinizi:");
        a =input.nextFloat();

        Alan =(pi*(r*r)*a)/360;

        System.out.println("Dairenin Alanı:"+ Alan);

    }
}
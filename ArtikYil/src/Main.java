import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int yıl;
        Scanner input = new Scanner(System.in);
        System.out.println("Yıl Giriniz :");
        yıl = input.nextInt();

        if(yıl%100 == 0){
            if(yıl%400==0)
                System.out.println(yıl+" Artık yıldır.");
            else
                System.out.println(yıl+" Artık yıl değildir.");
        }
        else{
            if(yıl%4==0)
                System.out.println(yıl+" Artık yıldır.");

            else
                System.out.println(yıl+" Artık yıl değildir.");
        }
    }
}
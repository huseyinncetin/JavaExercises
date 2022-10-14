import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int sıcaklık;

        Scanner input = new Scanner(System.in);

        System.out.print("Sıcaklığı giriniz:");
        sıcaklık =input.nextInt();

        if(sıcaklık<5)
            System.out.println("Kayak yapılabilir.");
        else if (sıcaklık>5&&sıcaklık<15)
            System.out.println("Sinemaya gidilebilir.");
        else if (sıcaklık>15&&sıcaklık<25)
            System.out.println("Piknik yapılabilir.");
        else if (sıcaklık>25)
            System.out.println("Yüzmeye gidilebilir.");



    }
}
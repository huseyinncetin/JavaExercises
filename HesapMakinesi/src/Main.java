import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int num1,num2,islem;

        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz:");
        num1 =input.nextInt();
        System.out.print("İkinci sayıyı giriniz:");
        num2 =input.nextInt();

        System.out.println("Yapmak istediğiniz işlemi seçiniz:1/Toplama 2/Çıkarma 3/Çarpma 4/Bölme");
        islem=input.nextInt();

        switch (islem){
            case(1):
                System.out.print(num1+num2); break;
            case(2):
                System.out.print(num1-num2); break;
            case(3):
                System.out.print(num1*num2); break;
            case(4):
                System.out.print(num1/num2); break;


        }
    }
}
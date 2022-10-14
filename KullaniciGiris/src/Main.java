import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int password = 5;
        int yeniSifre;
        int istek;

        Scanner input = new Scanner(System.in);

        System.out.print("Parolanızı giriniz:");
        password =input.nextInt();

        if( password!=5){
            System.out.println("Şifrenizi sıfırlamak ister misiniz:1/Evet 2/Hayır");
            istek =input.nextInt();

            if(istek==1){

                System.out.println("Şifreyi giriniz:");
                yeniSifre = input.nextInt();

                if(yeniSifre == 5){
                    System.out.println("Şifre oluşturulamadı lütfen tekrar deneyin.");
                }
               else if((yeniSifre != 5 )) {
                    System.out.println("Şifre oluşturuldu");
                }
            }
        }
    }
}

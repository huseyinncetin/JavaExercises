import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double Kdv =0.18;
        double kdvliFiyat,kdvsizFiyat;

        Scanner input = new Scanner(System.in);
        System.out.println("Paranızın tutarını giriniz:");
        kdvsizFiyat = input.nextInt();

        if(kdvsizFiyat > 1000 && kdvsizFiyat < 0){
            Kdv = 0.08;
            kdvliFiyat = kdvsizFiyat + (kdvsizFiyat*Kdv);

        }
        else
        kdvliFiyat = kdvsizFiyat + (kdvsizFiyat*Kdv);

        System.out.println("Kdvsiz Fiyat:"+ kdvsizFiyat);
        System.out.println("Kdvli Fiyat:" + kdvliFiyat);
        System.out.println("Kdv Oranı:" + Kdv);
    }
}
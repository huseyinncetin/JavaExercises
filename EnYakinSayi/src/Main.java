import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] dizi ={15,12,788,1,-1,-778,2,0};
        int sayi,i=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayıyı giriniz: ");
        sayi = input.nextInt();
        int kücük=sayi;
        int büyük=sayi;
        Arrays.sort(dizi);

        while (sayi>dizi[i]){
            kücük=i;
            i++;
            büyük=i;
        }
        System.out.println("Girilen sayıdan küçük en yakın sayı :"+ dizi[kücük]);
        System.out.println("Girilen sayıdan büyük en yakın sayı :"+ dizi[büyük]);

    }
}
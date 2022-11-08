import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int boyut,sayac =0, temp;
        Scanner input = new Scanner(System.in);
        System.out.println("Dizinin boyutunu giriniz: ");
        boyut = input.nextInt();

        int[] dizi = new int[boyut];
        while(sayac<boyut){
            System.out.print((sayac+1) +".elemanı giriniz: ");
            dizi[sayac]=input.nextInt();
            sayac++;
        }
        // İstenirse burada Arrays.sort() kullanılabilir.

        System.out.print("Sıralanmış dizi : ");
        for(int i =0 ; i<boyut;i++){
            for(int j=i+1;j<boyut;j++){
                if(dizi[i]>dizi[j]){
                    temp = dizi[i];
                    dizi[i]=dizi[j];
                    dizi[j]=temp;
                }
            }
        }
        for(int i=0;i<boyut;i++){
            System.out.print(dizi[i]+" ");
        }
    }
}
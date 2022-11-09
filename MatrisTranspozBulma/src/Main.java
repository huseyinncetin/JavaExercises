import java.util.Scanner;

public class Main {
    public static void matrisYazdir(int[][] matris){
        for (int i=0;i< matris.length;i++){
            for(int j=0;j<matris[i].length;j++){
                System.out.print(matris[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Satır sayısını giriniz :");
        int satir = input.nextInt();
        System.out.print("Sütun sayısını giriniz :");
        int sütun = input.nextInt();
        int[][] matris = new int[satir][sütun];
        int[][] transpoz = new int[matris[1].length][matris.length];

        System.out.println("Matris elemanlarını giriniz :");
        for(int i=0;i< matris.length;i++){
            for(int j=0;j<matris[i].length;j++){
               matris[i][j]=input.nextInt();
            }
        }
        System.out.println("Matris : ");
        matrisYazdir(matris);

        for(int i =0;i<matris.length;i++){
            for(int j =0;j<matris[i].length;j++){
                transpoz[j][i]=matris[i][j];
            }
        }
        System.out.println("Transpoze : ");
        matrisYazdir(transpoz);
    }
}
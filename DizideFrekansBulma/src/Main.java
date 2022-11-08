import java.util.Arrays;

public class Main {
    static int tekrarSayar(int[] arr,int value){
        int count =0;
        for(int i =0;i< arr.length;i++){
            if(value == arr[i]){
                count++;
            }
        }
        return count;
    }

    static boolean tekrarBulan(int[]arr,int value){

        for(int i=0;i< arr.length;i++){
            if(value== arr[i]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int sayac =0;
        int [] dizi ={10,20,20,10,10,20,5,20};
        int [] tekrar = new int[dizi.length];
        System.out.print("Dizi : "+Arrays.toString(dizi)+"\n");
        System.out.println("Tekrar Sayıları");

        for (int i=0;i< dizi.length;i++){
            if(tekrarBulan(tekrar,dizi[i])){
                System.out.println(dizi[i]+" sayısı "+tekrarSayar(dizi,dizi[i])+" kere tekrar edildi.");
                tekrar[sayac++]=dizi[i];
            }
        }
    }
}
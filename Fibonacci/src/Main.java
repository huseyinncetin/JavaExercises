import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int fiboilk=0,fiboson=1,N;
        Scanner input = new Scanner(System.in);
        System.out.println("Eleman sayıyısını giriniz:");
        N = input.nextInt();

        for(int i=0;i<N;i++){
            if(i%2==0){
                System.out.println(fiboilk);
                fiboilk = fiboson+fiboilk;
            }
            else{
                System.out.println(fiboson);
                fiboson =fiboson+fiboilk;
            }
        }
    }
}
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        n=input.nextInt();

        for (int i =0;i<n;i++){
            for (int j=0;j<(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i)+1;k++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i =1;i<n;i++){
            for(int j =0;j<i+1;j++){
                System.out.print(" ");
            }
            for(int k=1; k<=2*(n-i)-1; k++){
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}
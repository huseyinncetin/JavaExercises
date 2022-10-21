import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int basamak;
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç basamak üçgen istersiniz :");
        basamak = input.nextInt();

        for(int i=0;i<basamak;i++){

            for (int k=0;k<i;k++){
                System.out.print(" ");
            }

            for(int j=1;j<2*(basamak-i);j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}
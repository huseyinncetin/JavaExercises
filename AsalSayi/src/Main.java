import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i,j;

        for( i=2;i<100;i++){
            int kontrol =0;
            for (j=2;j<i;j++){
                if(i%j==0){
                    kontrol=1;
                    break;
                }
            }
            if(kontrol==0){
                System.out.println(i);
            }
        }
    }
}
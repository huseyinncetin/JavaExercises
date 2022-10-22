import java.util.Scanner;

public class Main {

    static void desen(int number,int tempNumber,int a){

        if(number>0 && a==0){
            System.out.print(number+" ");
            number-=5;
            desen(number,tempNumber,0);

        }
        else if(number <=0){
            System.out.print(number+" ");
            number +=5;
            desen(number,tempNumber,1);
        }

        else if (number> 0 && number <=tempNumber && a==1){
            System.out.print(number+" ");
            number +=5;
            desen(number,tempNumber,1);
        }

    }




    public static void main(String[] args){
        int N;
        Scanner input = new Scanner(System.in);
        System.out.println("N Sayısı :");
        N = input.nextInt();

       desen(N,N,0);

    }
}
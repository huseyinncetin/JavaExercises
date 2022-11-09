import java.util.Scanner;

public class Main {

    public static void palidrom(String kelime){

        int i=0;
        int j=kelime.length()-1;

        while(j>i){
            if(kelime.charAt(i)!=kelime.charAt(j)){
                System.out.println("Palidrom değildir.");
                return;
            }
            i++;
            j--;
        }
        System.out.println("Palidromdur.");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kelimeyi giriniz :");
        String kelime =input.nextLine();

        palidrom(kelime);
    }
}